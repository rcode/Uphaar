package com.yogaveda.uphaar.navigation.di

import com.yogaveda.uphaar.navigation.Navigator
import org.koin.dsl.module

val navigationModule = module {
    single { Navigator() }
}