package com.plus.taxiapp.api.member.request

data class RegisterAccountRequest(
    val memberId: Long,
    val accountNum: String,
    val accountPassword: String,
    val accountHolder: String,
    val accountHolderInfo: String,
    val bankName: String,
    val isDefault: Boolean,
)