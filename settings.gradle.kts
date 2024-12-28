rootProject.name = "fabric-multi-gradle-template"

pluginManagement {
    repositories {
        gradlePluginPortal()
        maven("https://maven.fabricmc.net/")
    }
}

include("template-common")
include("template-client")
include("template-server")

