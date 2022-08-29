import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.7.10"
    id("io.papermc.paperweight.userdev") version "1.3.6"
}

group = "io.github.rysefoxx"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://repo.codemc.io/repository/maven-snapshots/")
}

dependencies {
    paperDevBundle("1.19-R0.1-SNAPSHOT")
    implementation("net.axay:kspigot:1.19.0")
    implementation("net.kyori:adventure-text-minimessage:4.11.0")
}


tasks.withType(JavaCompile::class.java) {
    options.encoding = "UTF-8"
    options.release.set(17)
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "17"
}