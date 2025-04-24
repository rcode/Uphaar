package com.yogaveda.uphaar.di


expect class KoinInitializer {
    fun init()
}

// Use the KoinInitializer to initialize platform specific DI if required
/*
fun initKoin(config: KoinAppDeclaration? = null) {
    startKoin {
        config?.invoke(this)
        modules(sharedAppModule, platformAppModule)
    }
}
*/
