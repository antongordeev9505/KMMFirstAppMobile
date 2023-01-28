object Dependencies {
    //there will be all dependencies
    object Kotlin {
        private const val version = "1.7.10"
        const val gradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$version"
    }

    object Compose {
        private const val version = "1.2.0-beta01"
        const val gradlePlugin = "org.jetbrains.compose:compose-gradle-plugin:$version"
    }

    object Android {
        const val gradlePlugin = "com.android.tools.build:gradle:7.2.2"
    }
}