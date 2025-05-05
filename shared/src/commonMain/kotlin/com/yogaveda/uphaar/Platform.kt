package com.yogaveda.uphaar

/**
 * Interface for implementing platform level functionality.
 */
interface Platform {
    val name: String
}

expect fun getPlatform(): Platform