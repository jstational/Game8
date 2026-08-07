import org.gradle.jvm.tasks.Jar
import java.nio.file.Files
import java.nio.file.Paths

plugins {
    java
}

// this repo contains code that will be merged into src
object apply {
    val fromURL = "https://github.com/jstational/g8tf.git"
    val fromBranch = "main"
    val fromDir = "src/"

    // apply here
    val toDir = "src/"
}

// Mindustry version to depend on.
// Valid values:
// - latest: depend on the latest release of mindustry
// - be: depend on the very latest commit of mindustry
// - v<number>: depend on a specific commit
val mindustryVersion = "latest"
val projectVersion = "0"

val javaVersion = "17"

object dirs {
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

// this was converted to kotlin cause im more familiar with it
// i might learn Groovy for my tech stack sometime

// always assumes src/javascript exists, if a refactor changes src/javascript's path, change srcDirs.javascriptSourceDir
tasks.register("rename") {
    doFirst {
        val jstarget = layout.projectDirectory.dir(dirs.source.javascriptSourceDir).asFile.toPath()
        val jsnew = layout.projectDirectory.dir(dirs.source.sourceDir + "/scripts").asFile.toPath()

        if(Files.exists(jstarget)) {
            Files.move(jstarget, jsnew)
        }
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
    compileOnly(if(mindustryVersion == "be") "Anuken:MindustryBuilds:latest" else "Anuken:Mindustry:$mindustryVersion")
}

tasks.register("jarAndroid") {
    dependsOn("jar")
    val projectName = project.name
    val noAndroidSDK: String = "No valid Android SDK found. Ensure that ANDROID_HOME is set to your Android SDK directory."
    val noAndroidJar: String = "No android.jar found. Ensure that you have an Android platform installed."

    doLast {
        if(sdkRoot.isNullOrEmpty() || !File(sdkRoot).exists()) throw GradleException(noAndroidSDK)

        val platformRoot = File("$sdkRoot/platforms/").listFiles().sortedDescending().toList().find {
                File(it, "android.jar").exists()
            }

        if(platformRoot == null) throw GradleException(noAndroidJar)

        //collect dependencies needed for desugaring
        val dependencies = (configurations.compileClasspath.get().files + configurations.runtimeClasspath.get().files + File(platformRoot, "android.jar")).joinToString(" ") { "--classpath ${it.path}" }

        val d8 = if(isWindows) "d8.bat" else "d8"

        //dex and desugar files - this requires d8 in your PATH
        val commands = "$d8 $dependencies --min-api 14 --output ${projectName}Android.jar ${projectName}Desktop.jar"
        val dexAndDesugar = ProcessBuilder(commands.split(" ")).directory(File("build/libs")).redirectOutput(ProcessBuilder.Redirect.INHERIT).redirectError(ProcessBuilder.Redirect.INHERIT).start()
        dexAndDesugar.waitFor()
    }
}

tasks.jar {
    dependsOn("rename")

    archiveFileName = "${project.name}Desktop.jar"

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
    archiveFileName.set("${projectName}.jar")

    from({
        listOf(
            zipTree("build/libs/${projectName}Desktop.jar"),
            zipTree("build/libs/${projectName}Android.jar")
        )
    })

    doLast {
        delete("build/libs/${projectName}Android.jar")
        delete("build/libs/${projectName}Desktop.jar")
    }
}