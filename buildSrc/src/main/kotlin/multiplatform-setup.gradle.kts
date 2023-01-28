plugins {
    //here there are main setups for all project which we will use in build.gradle on modules level
    id("com.android.library")
    kotlin("multiplatform")
    // the same is id("kotlin-multiplatform")
    kotlin("kapt")
}

//targets
kotlin {
    jvm("desktop")
    android()
    ios()
}