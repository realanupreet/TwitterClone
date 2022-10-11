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

    object Favorite : Screens("screenhome2", "Favorite", R.drawable.home)
    object Notification :
        Screens("screenhome", "Notification", R.drawable.notifications)

    object MyNetwork : Screens("screenhome", "MyNetwork", R.drawable.search)
    object Messages : Screens("messages", "Messages", R.drawable.messages)
    object Profile : Screens( "profile/{User}",title = "Profile",resourceId = R.drawable.home)
    object ComposeTweet : Screens( "composetweet",title = "ComposeTweet",resourceId = R.drawable.compose)
}

val items = listOf(
    Screens.Favorite,
    Screens.MyNetwork,
    Screens.Notification,
    Screens.Messages
)

