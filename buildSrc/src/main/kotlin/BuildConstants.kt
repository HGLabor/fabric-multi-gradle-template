import org.jetbrains.kotlin.gradle.dsl.JvmTarget

object BuildConstants {
    const val majorMinecraftVersion = "1.21"
    const val minecraftVersion = "$majorMinecraftVersion"
    const val javaVersion = 21
    val jvmTarget = JvmTarget.JVM_21
}