plugins {
    kotlin("jvm")
    kotlin("plugin.serialization")
}

tasks {
    compileJava {
        options.encoding = Charsets.UTF_8.name()
        options.release.set(BuildConstants.javaVersion)
    }
    compileKotlin {
        compilerOptions {
            jvmTarget.set(BuildConstants.jvmTarget)
            freeCompilerArgs.add("-Xjvm-default=all")
            freeCompilerArgs.add("-Xskip-prerelease-check")
            freeCompilerArgs.add("-Xcontext-receivers")
        }
    }
}

kotlin {
    jvmToolchain(BuildConstants.javaVersion)

    sourceSets.all {
        languageSettings.optIn("kotlin.RequiresOptIn")
    }
}
