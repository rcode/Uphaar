package com.yogaveda.uphaar.domain.repository

import com.yogaveda.uphaar.domain.model.UserModel
import kotlinx.coroutines.flow.Flow

interface UserRepository {

    fun getUserFromId(userId: String): Flow<Result<UserModel>>

    fun updateUser(userModel: UserModel): Flow<Result<UserModel>>
}