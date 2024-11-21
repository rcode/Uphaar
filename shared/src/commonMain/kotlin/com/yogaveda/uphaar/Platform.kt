package com.yogaveda.uphaar

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform