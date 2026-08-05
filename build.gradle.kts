import org.gradle.jvm.tasks.Jar
import java.io.file.Files
import java.io.file.Paths

plugins {
    java
}

// this repo contains code that will be merged into src
val otherURL = "https://github.com/jstational/g8tf.git"
val otherR = "main"
val otherDir = "src"

version = "1.0"

sourceSets.main.java.srcDirs("src/java")

// this was converted to kotlin cause im more familiar with it
// i might learn Groovy for my tech stack sometime

// always assumes src/javascript exists, if a refactor changes src/javascript's path, change this too
tasks.register("rename") {
    doFirst {
        val target = layout.projectDirectory.dir("src/javascript").asFile.toPath()
        val new = layout.projectDirectory.dir("src/scripts").asFile.toPath()

        Files.move(target, new)
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
    targetCompatibility = JavaVersion.VERSION_17
    sourceCompatibility = JavaVersion.VERSION_17
}

// Mindustry version to depend on.
// Valid values:
// - latest: depend on the latest release of mindustry
// - be: depend on the very latest commit of mindustry
// - v<number>: depend on a specific commit
val mindustryVersion = "latest"
val isWindows = System.getProperty("os.name").toLowerCase().contains("windows")
val sdkRoot = System.getenv("ANDROID_HOME") ?: System.getenv("ANDROID_SDK_ROOT")

dependencies {
    compileOnly(
        if(mindustryVersion == "be") "Anuken:MindustryBuilds:latest" else "Anuken:Mindustry:$mindustryVersion"
    )
}

val jarAndroid = tasks.register("jarAndroid") {
    dependsOn("jar")
    val projectName = project.name
    val noAndroidSDK: String = "No valid Android SDK found. Ensure that ANDROID_HOME is set to your Android SDK directory."
    val noAndroidJar: String = "No android.jar found. Ensure that you have an Android platform installed."

    doLast {
        if(sdkRoot.isNullOrEmpty() || !new File(sdkRoot).exists()) throw new GradleException(noAndroidSDK)

        val platformRoot = File("$sdkRoot/platforms/").listFiles().sortedDescending.find {
                File(it, "android.jar")
            }

        if(!platformRoot) throw new GradleException(noAndroidJar)

        //collect dependencies needed for desugaring
        val dependencies = (configurations.get().files + configurations.runtimeClasspath.get().files + File(platformRoot, "android.jar")).joinToString(" ") { "--classpath ${it.path}" }

        val d8 = isWindows ? "d8.bat" else "d8"

        //dex and desugar files - this requires d8 in your PATH
        val commands = "$d8 $dependencies --min-api 14 --output ${projectName}Android.jar ${projectName}Desktop.jar"
        val dexAndDesugar = ProcessBuilder(commands.split(" ")).directory(File("build/libs")).redirectOutput(ProcessBuilder.Redirect.INHERIT).redirectError(ProcessBuilder.Redirect.INHERIT).start()
        dexAndDesugar.waitFor()
    }
}

tasks.jar {
    archiveFileName = "${project.name}Desktop.jar"

    from({
        configurations.runtimeClasspath.get().map {
            it.isDirectory() ? it else zipTree(it)
        }
    })

    from("assets/") {
        include("**")
    }

    from("src/") {
        include("scripts")
    }

    from(projectDir) {
        include("mod.hjson")
    }
}

tasks.register<Jar>("deploy") {
    val projectName = project.name
    dependsOn(jarAndroid)
    dependsOn(jar)
    archiveFileName.set("${projectName}.jar")

    from({
        listOf(zipTree("build/libs/${projectName}Desktop.jar"), zipTree("build/libs/${projectName}Android.jar"))
    })

    doLast {
        delete("build/libs/${projectName}Android.jar")
    }
}