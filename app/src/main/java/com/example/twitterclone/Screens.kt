package com.example.twitterclone

import android.content.res.Resources
import android.content.res.loader.ResourcesLoader
import androidx.annotation.DrawableRes
import androidx.annotation.IntegerRes
import androidx.annotation.StringRes
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.twitterclone.model.User

sealed class Screens(val route: String, val title: String, @DrawableRes val resourceId: Int) {

    object Favorite : Screens("screenone", "Favorite", R.drawable.profile_photo)
    object Notification :
        Screens("screentwo", "Notification", R.drawable.profile_photo)

    object MyNetwork : Screens("screenhome", "MyNetwork", R.drawable.profile_photo)
    object Messages : Screens("screenhome", "Messages", R.drawable.profile_photo)
    object Profile : Screens( "profile/{User}",title = "Profile",resourceId = R.drawable.profile_photo)
}

val items = listOf(
    Screens.Favorite,
    Screens.Notification,
    Screens.MyNetwork,
    Screens.Messages
)

