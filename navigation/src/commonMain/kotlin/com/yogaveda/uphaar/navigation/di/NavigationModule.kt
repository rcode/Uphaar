package com.yogaveda.uphaar.navigation.di

import com.yogaveda.uphaar.core.ui.navigation.NavigationFlowApi
import com.yogaveda.uphaar.navigation.NavigationFlow
import org.koin.dsl.bind
import org.koin.dsl.module

val navigationModule = module {
    single { NavigationFlow() }.bind(NavigationFlowApi::class)
}