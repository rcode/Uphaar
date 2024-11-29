package com.yogaveda.uphaar.data.main.api

import com.yogaveda.uphaar.domain.model.UserModel
import io.ktor.client.HttpClient

class UpHaarRemoteApi (
    val httpClient: HttpClient
) {

    suspend fun getUserFromId(): UserModel {
        return UserModel()
    }

    suspend fun updateUser(user: UserModel): UserModel {
        return UserModel()
    }
}