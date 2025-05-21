package com.example.kmplib

class Greeting {
    companion object {
        var onClickListener: ((Int) -> Unit)? = null
    }

    private val platform: Platform = getPlatform()

    fun greet(): String {
        return "Hello, ${platform.name}!"
    }

    fun invokeClick() {
        onClickListener?.invoke(20)
    }

    fun setOnClick(onClick: (Int) -> Unit) {
        onClickListener = onClick
    }
}