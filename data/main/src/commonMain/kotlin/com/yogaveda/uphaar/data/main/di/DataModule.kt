package com.yogaveda.uphaar.data.main.di

import com.yogaveda.uphaar.data.main.api.UpHaarRemoteApi
import com.yogaveda.uphaar.data.main.repository.UserRepositoryImpl
import com.yogaveda.uphaar.data.remote.client
import com.yogaveda.uphaar.domain.repository.UserRepository
import io.ktor.client.HttpClient
import org.koin.core.module.Module
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

val dataModule = module {
    /*single {
        UserRepositoryImpl(get())
    }.bind<UserRepository>()
        OR
    */

    singleOf(::UserRepositoryImpl).bind<UserRepository>()
    singleOf(::UpHaarRemoteApi)
    single {
        client
    }.bind<HttpClient>()
}

/**
 * To get different platform specific dependencies
 */
//expect val dataModule: Module