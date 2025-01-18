package com.yogaveda.uphaar

import android.app.Application
import com.yogaveda.uphaar.di.KoinInitializer

class UphaarApp: Application() {

    override fun onCreate() {
        super.onCreate()

        KoinInitializer(applicationContext).init()
    }
}