package com.example.twitterclone

import android.net.Uri
import android.os.Bundle
import androidx.navigation.NavType
import com.example.twitterclone.model.User
import com.google.gson.Gson

class UserType : NavType<User>(isNullableAllowed = false){
    override fun get(bundle: Bundle, key: String): User? {
        return bundle.getParcelable(key)
    }
    override fun parseValue(value: String): User {
        return Gson().fromJson(value, User::class.java)
    }
    override fun put(bundle: Bundle, key: String, value: User) {
        bundle.putParcelable(key, value)
    }
    override fun toString(): String {
        return Uri.encode(Gson().toJson(this))
    }
}

