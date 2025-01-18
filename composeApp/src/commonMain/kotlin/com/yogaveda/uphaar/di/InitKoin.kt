package com.yogaveda.uphaar.di

import org.koin.core.context.startKoin
import org.koin.dsl.KoinAppDeclaration

expect class KoinInitializer {
    fun init()
}

/*
fun initKoin(config: KoinAppDeclaration? = null) {
    startKoin {
        config?.invoke(this)
        modules()
    }
}*/
