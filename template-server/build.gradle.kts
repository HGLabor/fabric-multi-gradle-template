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
    //maven("https://maven.wispforest.io")
}

dependencies {
    include(implementation(project(":template-common", configuration = "namedElements"))!!)
}

loom {
    runConfigs.configureEach {
        this.ideConfigGenerated(true)
    }
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


