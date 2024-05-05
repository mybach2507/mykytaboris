plugins {
    java
    kotlin("jvm") version "1.9.23"
    id("io.github.goooler.shadow") version "8.1.7"
}

group = "io.github.example"
version = "0.1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://s01.oss.sonatype.org/content/repositories/snapshots/")
    maven("https://repo.papermc.io/repository/maven-public/")
}

dependencies {
    compileOnly("io.papermc.paper:paper-api:1.20.6-R0.1-SNAPSHOT")
}


java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(21))
}

tasks {
    shadowJar {
        archiveFileName = "epic-spleef-${project.version}.jar"
    }
}
