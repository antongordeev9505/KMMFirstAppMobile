package com.example.kmmfirstappmobile

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform