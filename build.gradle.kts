import org.gradle.jvm.tasks.Jar
import java.nio.file.*
import java.net.HttpURLConnection
import java.net.URL
import java.util.zip.ZipInputStream
import java.io.*
import java.util.zip.*
import kotlin.random.Random

val projectName = "game8"

val req = "g8tf"
val owner = "jstational"

// Mindustry version to depend on.
// Valid values:
// - latest: depend on the latest release of mindustry
// - be: depend on the very latest commit of mindustry
// - v<number>: depend on a specific commit
val mindustryVersion = "latest"

plugins {
    java
}

// SUPER unstable
val toApply: HashMap<String, HashMap<String, HashMap<String, String>>> = hashMapOf(
    req to hashMapOf(
        "get" to hashMapOf(
            "fromURL" to "https://github.com/" + owner +"/" + req + "/archive/refs/heads",
            "fromBranch" to "main",
            "fromDir" to dirs.defaultSourceDir,

            "toDir" to dirs.defaultSourceDir
        ),

        "replaceString" to hashMapOf(
            req to project.name
        ),
    )
)

val javaVersion = "17"

object dirs {
    val defaultSourceDir = "core/src"
    val coreDir = "core"

    object source {
        val sourceDir = dirs.coreDir + "/src"

        val javascriptSourceDir = dirs.source.sourceDir + "/javascript"
        val javaSourceDir = dirs.source.sourceDir + "/java"
    }

    object assets {
        val assetDir = dirs.coreDir + "/assets"
    }
}

sourceSets.main.get().java.srcDirs(dirs.source.javaSourceDir)

tasks.register("rename") {
    dependsOn("applying")
    doFirst {
        val jstarget = layout.projectDirectory.dir(dirs.source.javascriptSourceDir).asFile.toPath()
        val jsnew = layout.projectDirectory.dir(dirs.source.sourceDir + "/scripts").asFile.toPath()

        if(Files.exists(jstarget)) {
            Files.move(jstarget, jsnew)
        }
    }
}

tasks.register("applying") {
    doFirst {
        for((k, hash) in toApply) {
            val noURL = "required url field is missing, cant load: " + k
            val noDir = "required directory field is missing, cant load: " + k

            val fromURL = hash["get"] ?.get("fromURL") ?: error(noURL)
            val fromBranch = hash["get"] ?.get("fromBranch") ?: "main"

            val currentIdentifier = k + Random.nextInt(0, 10000)

            val downloadToString = projectDir.toString() + "/applierdownloaded/" + currentIdentifier
            val extractToString = projectDir.toString() + "/applierextracted/" + currentIdentifier
            val extractTo = File(extractToString)
            val downloadTo = File(downloadToString)

            downloadTo.mkdirs()
            extractTo.mkdirs()

            val zip = File(downloadTo, currentIdentifier + ".zip")

            downloadRepo(uri(fromURL + "/" + fromBranch).toURL(), zip)
            extractZip(zip, extractTo)

            val getInZip = hash["get"] ?.get("fromDir") ?: error(noDir)
            val putToDir = hash["get"] ?.get("toDir") ?: error(noDir)

            val obtain = File(extractTo, getInZip)
            val putToFile = File(putToDir)

            obtain.copyRecursively(File(putToDir), overwrite = false)

            (hash["replaceString"] as ? Map<String, String>) ?.forEach { 
                (k, v) ->
                replaceString(putToFile, k, v)
            }
        }
    }
}

// returns the downloaded zip file after downloading the repo
fun downloadRepo(url: URL, dir: File) {
    dir.parentFile ?.mkdirs()

    val getter = url.openConnection() as HttpURLConnection

    getter.instanceFollowRedirects = true
    getter.connectTimeout = 50000
    getter.readTimeout = 100000

    try {
        getter.inputStream.use {
            ins ->
            dir.outputStream().use {
                outs ->
                ins.copyTo(outs)
            }
        }
    } finally {
        getter.disconnect()
    }
}

fun replaceString(from: File, fromString: String, toString: String) {
    if(!from.exists()) {
        error("directory doesnt exist: " + from.name)
    }

    from.walk().filter {
        it.isFile
    }.forEach {
        file ->
        if (file.readText.contains(fromString)) {
            file.writeText(file.readText().replace(fromString, toString))
        }
    }
}

fun extractZip(from: File, to: File) {
    if(!from.exists()) {
        error("zip doesnt exist: " + from.name)
    }

    val toCanon = to.canonicalPath

    to.mkdirs()

    ZipFile(from).use {
        zip ->
        val entries = zip.entries()
        while(entries.hasMoreElements()) {
            val entry = entries.nextElement()
            val entryOutTo = File(to, entry.name)
            val entryCanon = entryOutTo.canonicalPath

            if(!entryCanon.startsWith(toCanon + File.separator) && entryCanon != toCanon) {
                error("zip entry is not inside of to: " + entry.name)
            }

            if(entry.isDirectory) {
                entryOutTo.mkdirs()
            } else {
                entryOutTo.parentFile ?.mkdirs()
                zip.getInputStream(entry).use {
                    ins ->
                    entryOutTo.outputStream().use {
                        outs ->
                        ins.copyTo(outs)
                    }
                }
            }
        }
    }
}

java {
    val ver = if(javaVersion == "latest") JavaVersion.values().last() else if(javaVersion == "mindustryJavaVersion") JavaVersion.VERSION_17 else try {
        JavaVersion.toVersion(javaVersion)
    } catch(e: IllegalArgumentException) {
        JavaVersion.VERSION_17
    }

    targetCompatibility = ver
    sourceCompatibility = ver
}

val isWindows = System.getProperty("os.name").lowercase().contains("windows")
val sdkRoot = System.getenv("ANDROID_HOME") ?: System.getenv("ANDROID_SDK_ROOT")

dependencies {
    compileOnly(if(mindustryVersion == "be") "Anuken:MindustryBuilds:latest" else "Anuken:Mindustry:" + mindustryVersion)
}

tasks.register("jarAndroid") {
    dependsOn("jar")
    val projectName = project.name
    val noAndroidSDK: String = "No valid Android SDK found. Ensure that ANDROID_HOME is set to your Android SDK directory."
    val noAndroidJar: String = "No android.jar found. Ensure that you have an Android platform installed."

    doLast {
        if(sdkRoot.isNullOrEmpty() || !File(sdkRoot).exists()) throw GradleException(noAndroidSDK)

        val platformRoot = File(sdkRoot +"/platforms/").listFiles().sortedDescending().toList().find {
                File(it, "android.jar").exists()
            }

        if(platformRoot == null) throw GradleException(noAndroidJar)

        //collect dependencies needed for desugaring
        val dependencies = (configurations.compileClasspath.get().files + configurations.runtimeClasspath.get().files + File(platformRoot, "android.jar")).joinToString(" ") { "--classpath " + it.path }

        val d8 = if(isWindows) "d8.bat" else "d8"

        //dex and desugar files - this requires d8 in your PATH
        val commands = d8 + " $dependencies --min-api 14 --output " + projectName + "Android.jar " + projectName + "Desktop.jar"
        val dexAndDesugar = ProcessBuilder(commands.split(" ")).directory(File("build/libs")).redirectOutput(ProcessBuilder.Redirect.INHERIT).redirectError(ProcessBuilder.Redirect.INHERIT).start()
        dexAndDesugar.waitFor()
    }
}

tasks.jar {
    dependsOn("rename")

    archiveFileName = project.name + "Desktop.jar"

    from(dirs.source.sourceDir + "/") {
        include("scripts/**")
    }

    from({
        configurations.runtimeClasspath.get().map {
            if(it.isDirectory()) it else zipTree(it)
        }
    })

    from(dirs.assets.assetDir + "/") {
        include("**")
    }

    from(projectDir) {
        include("mod.hjson")
    }
}

tasks.register<Jar>("deploy") {
    val projectName = project.name
    dependsOn("jarAndroid")
    dependsOn("jar")
    archiveFileName.set(projectName + ".jar")

    from({
        listOf(
            zipTree("build/libs/" + projectName +"Desktop.jar"),
            zipTree("build/libs/" + projectName +"Android.jar")
        )
    })

    doLast {
        delete("build/libs/" + projectName + "Android.jar")
        delete("build/libs/" + projectName + "Desktop.jar")
    }
}

repositories {
    mavenCentral()

    //Downloads the dependencies JAR file from Mindustry releases; does not use any real repository. Surprisingly, this is the most reliable option.
    ivy {
        url = uri("https://github.com/")

        patternLayout {
            artifact("/[organisation]/[module]/releases/download/[revision]/dependencies.jar")
        }

        metadataSources {
            artifact()
        }
    }

    //If the version is set to "latest", downloads the latest Mindustry *release* as a dependency
    ivy {
        url = uri("https://github.com/")

        patternLayout {
            artifact("/[organisation]/[module]/releases/[revision]/download/dependencies.jar")
        }

        metadataSources {
            artifact()
        }
    }

    //For depending on the absolute newest commit for Mindustry
    ivy {
        url = uri("https://github.com/")

        patternLayout {
            artifact("/[organisation]/[module]/releases/download/master/[revision].jar")
        }

        metadataSources {
            artifact()
        }
    }
}