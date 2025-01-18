package com.yogaveda.uphaar.feature.login.di

import com.yogaveda.uphaar.feature.login.viewmodel.LoginViewModel
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

actual val loginModule = module {
    singleOf(::LoginViewModel)
}