plugins {
    `kotlin-dsl`
}

repositories {
    mavenCentral()
    mavenLocal()
    google()
    maven(url = "https://maven.pkg.jetbrains.space/public/p/compose/dev")
}

dependencies {
    implementation(Dependencies.Kotlin.gradlePlugin)
    implementation(Dependencies.Compose.gradlePlugin)
    implementation(Dependencies.Android.gradlePlugin)
}

//here is all conventional plugins
//in this directory (buildSrc/src/main/kotlin) there are all general plugins for set up our project
kotlin {
    sourceSets.getByName("main").kotlin.srcDir("buildSrc/src/main/kotlin")
}