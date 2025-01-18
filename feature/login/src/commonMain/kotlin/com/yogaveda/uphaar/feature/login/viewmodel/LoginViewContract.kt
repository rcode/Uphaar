package com.yogaveda.uphaar.feature.login.viewmodel

import com.yogaveda.uphaar.core.ui.viewmodel.ViewEffect
import com.yogaveda.uphaar.core.ui.viewmodel.ViewEvent
import com.yogaveda.uphaar.core.ui.viewmodel.ViewState
import com.yogaveda.uphaar.domain.model.UserModel
import com.yogaveda.uphaar.feature.login.state.LoginUserState

class LoginViewContract {

    sealed class Event: ViewEvent {
        object Reset: Event()
        data class CreateUser(val user: LoginUserState) : Event()
    }

    data class State(
        val user: LoginUserState
    ) : ViewState

    sealed class Effect : ViewEffect {
        data class InvalidData (val message : String) : Effect()
        data class NavigateToGetStarted(val createdUser: UserModel) : Effect()
        object NavigateToCreateBoard : Effect()
    }
}