package com.yogaveda.uphaar.feature.login.state

data class LoginUserState(
    var fullName: String = "",
    var email: String = "",
    var password: String = "",
    var countryCode: String = "+91",
    var phone: String = "",
    var isLoading: Boolean = false,
    var isError: Boolean = false
) {

    fun reset() {
        fullName = ""
        email = ""
        password = ""
        countryCode = "+91"
        phone = ""
        isLoading = false
        isError = false
    }
}