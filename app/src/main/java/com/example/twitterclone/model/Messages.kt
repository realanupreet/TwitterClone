package com.example.twitterclone.model

import androidx.annotation.DrawableRes

data class Messages(
    val name: String,
    val username: String,
    @DrawableRes val avatar: Int,
    val message: String
)
