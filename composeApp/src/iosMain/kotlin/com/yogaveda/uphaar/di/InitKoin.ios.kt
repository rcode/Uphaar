package com.yogaveda.uphaar.di

import com.yogaveda.uphaar.data.main.di.dataModule
import com.yogaveda.uphaar.domain.di.domainModule
import com.yogaveda.uphaar.feature.login.di.loginModule
import org.koin.core.context.startKoin

actual class KoinInitializer {
    actual fun init() {
        startKoin {
            modules(listOf(sharedAppModule, domainModule, dataModule, loginModule))
        }
    }
}