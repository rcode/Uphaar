package com.yogaveda.uphaar.di

import android.content.Context
import com.yogaveda.uphaar.data.main.di.dataModule
import com.yogaveda.uphaar.domain.di.domainModule
import com.yogaveda.uphaar.feature.login.di.loginModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

actual class KoinInitializer (
    private val context: Context
) {
    actual fun init() {
        startKoin {
            androidContext(context)
            androidLogger()
            modules(listOf(sharedAppModule, domainModule, dataModule, loginModule))
        }
    }
}