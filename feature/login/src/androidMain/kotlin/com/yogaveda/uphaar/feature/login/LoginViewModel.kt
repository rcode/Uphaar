package com.yogaveda.uphaar.feature.login

import com.yogaveda.uphaar.core.ui.viewmodel.BaseViewModel
import com.yogaveda.uphaar.feature.login.state.LoginUserState

class LoginViewModel() :
    BaseViewModel<LoginViewContract.Event, LoginViewContract.State, LoginViewContract.Effect>() {

    override fun setInitialState() = LoginViewContract.State (
        user = LoginUserState()
    )

    override fun handleEvents(event: LoginViewContract.Event) {
        when (event) {
            is LoginViewContract.Event.Reset -> {}
            is LoginViewContract.Event.CreateUser -> {
                // Make API call to create user
                setState { copy() }
            }
            else -> { setEffect { LoginViewContract.Effect.InvalidData("Do not know how to handle this event") } }
        }
    }
}
