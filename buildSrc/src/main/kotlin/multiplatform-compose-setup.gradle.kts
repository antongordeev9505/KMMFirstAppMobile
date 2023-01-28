import gradle.kotlin.dsl.accessors._07fe892fb950cf896cc6cc0906a49a91.kotlin

plugins {
    //here there are setups for only compose part of project
    id("com.android.library")
    kotlin("multiplatform")
    id("org.jetbrains.compose")
}

kotlin {
    jvm("desktop")
    android()
    //since ios does not have compose we don`t have it here

    //default dependencies
    sourceSets {
        named("commonMain") {
            dependencies {
                implementation(compose.runtime)
                implementation(compose.foundation)
                implementation(compose.material)
            }
        }

        named("desktop") {
            dependencies {
                implementation(compose.desktop.common)
            }
        }
    }
}