import java.text.SimpleDateFormat
import java.util.*

plugins {
    fabric
    kotlin
    silk
}

version = "${BuildConstants.minecraftVersion}-1.0.0"

repositories {
    mavenCentral()
    //other repos
    //maven("https://maven.wispforest.io")
}

dependencies {
}

tasks {
    processResources {
        val properties = mapOf(
            "version" to project.version,
            "buildDate" to SimpleDateFormat("yyyyMMdd").format(Date())
        )
        inputs.properties(properties)
        filesMatching("fabric.mod.json") {
            expand(properties)
        }
    }
}
