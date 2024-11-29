package com.yogaveda.uphaar.domain.model

data class UserModel(
    var fullName: String = "",
    var email: String = "",
    var password: String = "",
    var countryCode: String = "+91",
    var phone: String = ""
)
