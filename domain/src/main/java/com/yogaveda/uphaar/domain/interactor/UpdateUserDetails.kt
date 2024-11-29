package com.yogaveda.uphaar.domain.interactor

import com.yogaveda.uphaar.core.base.interactor.BaseInteractor
import com.yogaveda.uphaar.domain.model.UserModel
import com.yogaveda.uphaar.domain.repository.UserRepository

class UpdateUserDetails (
    private val userRepository: UserRepository
) : BaseInteractor<UserModel, UpdateUserDetails.Params>() {

    data class Params(val user: UserModel)

    override suspend fun run(params: Params): UserModel {
        return userRepository.updateUser(params.user)
    }
}