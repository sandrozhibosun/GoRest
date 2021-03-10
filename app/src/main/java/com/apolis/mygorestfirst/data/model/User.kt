package com.apolis.mygorestfirst.data.model

data class User(
    val created_at: String,
    val email: String,
    val gender: String,
    val id: Int,
    val name: String,
    val status: String,
    val updated_at: String
)