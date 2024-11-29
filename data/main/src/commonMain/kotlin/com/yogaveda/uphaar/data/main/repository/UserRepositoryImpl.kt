package com.yogaveda.uphaar.data.main.repository

import com.yogaveda.uphaar.data.main.api.UpHaarRemoteApi
import com.yogaveda.uphaar.domain.model.UserModel
import com.yogaveda.uphaar.domain.repository.UserRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class UserRepositoryImpl (
    val remoteApi: UpHaarRemoteApi
): UserRepository {

    override fun getUserFromId(userId: String): Flow<Result<UserModel>> {
        return flow {
            emit(Result.success(UserModel()))
        }
    }

    override fun updateUser(userModel: UserModel): Flow<Result<UserModel>> {
        return flow {
            emit(Result.success(UserModel()))
        }
    }
}