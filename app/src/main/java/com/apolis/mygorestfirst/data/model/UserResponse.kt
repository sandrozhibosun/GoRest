package com.apolis.mygorestfirst.data.model

import com.google.gson.annotations.SerializedName

data class UserResponse(
    val code: Int,
    @SerializedName("data")
    val userList: ArrayList<User>,
    val meta: Meta
)