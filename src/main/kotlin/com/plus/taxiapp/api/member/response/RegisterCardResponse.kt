package com.plus.taxiapp.api.member.response

data class RegisterCardResponse(
    val cardNum: String,
    val expirationDate: String,
    val bankName: String,
    val isDefault: Boolean,
    val isVerified: Boolean,
)