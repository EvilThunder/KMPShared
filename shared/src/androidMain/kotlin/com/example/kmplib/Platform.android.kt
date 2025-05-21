package com.example.kmplib

import com.example.base.Tools

class AndroidPlatform : Platform {
    override val name: String = "Android ${android.os.Build.VERSION.SDK_INT}"
}

actual fun getPlatform(): Platform = AndroidPlatform()
actual fun getHello() = Tools.getHelloWorld()