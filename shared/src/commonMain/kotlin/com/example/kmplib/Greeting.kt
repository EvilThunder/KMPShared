package com.example.kmplib

class Greeting {
    companion object {
        var onClickListener: ((Int) -> Unit)? = null
        var onClickInterface: OnClickInterface? = null
    }

    interface OnClickInterface {
        fun onClick(value: Int)
    }

    private val platform: Platform = getPlatform()

    fun greet(): String {
        return "Hello, ${platform.name}!"
    }

    fun hello(): String {
        return "${getHello()}!"
    }

    fun invokeClick() {
        onClickListener?.invoke(20)
    }

    fun setOnClick(onClick: (Int) -> Unit) {
        onClickListener = onClick
    }

    fun invokeClickInterface() {
        onClickInterface?.onClick(20)
    }

    fun setOnclickInterface(onClick: OnClickInterface) {
        onClickInterface = onClick
    }
}