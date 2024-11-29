package com.yogaveda.uphaar.feature.login

import androidx.lifecycle.viewModelScope
import com.yogaveda.uphaar.core.ui.viewmodel.BaseViewModel
import com.yogaveda.uphaar.domain.interactor.UpdateUserDetails
import com.yogaveda.uphaar.domain.model.UserModel
import com.yogaveda.uphaar.feature.login.state.LoginUserState
import kotlinx.coroutines.launch

class LoginViewModel(
    val updateUserDetails: UpdateUserDetails
) :
    BaseViewModel<LoginViewContract.Event, LoginViewContract.State, LoginViewContract.Effect>() {

    override fun setInitialState() = LoginViewContract.State (
        user = LoginUserState()
    )

    override fun handleEvents(event: LoginViewContract.Event) {
        when (event) {
            is LoginViewContract.Event.Reset -> {}
            is LoginViewContract.Event.CreateUser -> {
                // Make API call to create user

                viewModelScope.launch {
                    updateUserDetails.run(UpdateUserDetails.Params(UserModel()))
                        .collect {
                            setState { copy() }
                        }

                }

            }
            else -> { setEffect { LoginViewContract.Effect.InvalidData("Do not know how to handle this event") } }
        }
    }



}
