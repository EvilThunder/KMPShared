package com.example.kmplib

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
expect fun getHello(): String