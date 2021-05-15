plugins {
    kotlin("jvm") version "1.5.0"
    id("com.diffplug.spotless") version "5.12.5"
}

allprojects {
    repositories {
        mavenCentral()
    }

    apply {
        plugin("com.diffplug.spotless")
    }

    spotless {
        java {
            googleJavaFormat()
        }
        kotlin {
            ktfmt()
        }
    }
}
