package com.yogaveda.uphaar.domain.di

import com.yogaveda.uphaar.domain.interactor.UpdateUserDetails
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val domainModule = module {
    singleOf(::UpdateUserDetails)
}