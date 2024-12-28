plugins {
    kotlin("jvm")
    id("fabric-loom")
}

dependencies {
    minecraft("com.mojang:minecraft:${BuildConstants.minecraftVersion}")
    mappings("net.fabricmc:yarn:${BuildConstants.minecraftVersion}+build.9:v2")
    modImplementation("net.fabricmc:fabric-loader:0.15.11")
    modImplementation("net.fabricmc.fabric-api:fabric-api:0.102.0+${BuildConstants.minecraftVersion}")
    modImplementation("net.fabricmc:fabric-language-kotlin:1.11.0+kotlin.2.0.0")
}
