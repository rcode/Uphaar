package com.yogaveda.uphaar.domain.repository

import com.yogaveda.uphaar.domain.model.UserModel

interface UserRepository {

    fun getUserFromId(userId: String): UserModel

    fun updateUser(userModel: UserModel): UserModel
}