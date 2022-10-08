package com.example.twitterclone.state


import com.example.twitterclone.R
import com.example.twitterclone.model.DrawerRow
import com.example.twitterclone.model.Tweet
import com.example.twitterclone.model.User


val sudorizwan = User(
    name = "Ahmed Rizwan",
    username = "sudo_rizwan",
    avatar = R.drawable.profile_photo,
    banner = R.drawable.profile_photo,
    bio = "Android Engineer @Snappymob",
    following = 393,
    followers = 339,
    verified = false
)

val androiddevs = User(
    name = "Android Developers",
    username = "AndroidDev",
    avatar = R.drawable.profile_photo,
    banner = R.drawable.profile_photo,
    bio = "News and announcements for developers from the Android team",
    following = 284,
    followers = 1000,
    verified = true
)

val drawerrowcontents = mutableListOf(
    DrawerRow("Profile",R.drawable.profile_photo),
    DrawerRow("Lists",R.drawable.profile_photo),
    DrawerRow("Twitter Circle",R.drawable.profile_photo),
    DrawerRow("Bookmarks",R.drawable.profile_photo),
    DrawerRow("Moments",R.drawable.profile_photo),
    DrawerRow("Monetization",R.drawable.profile_photo),
    DrawerRow("Settings and Privacy",R.drawable.profile_photo),
)
val settings = mutableListOf(
    DrawerRow("Your Account",R.drawable.profile_photo,"See information about your account, download an archive of your data, or learn about your account deactivation options"),
    DrawerRow("Security and account access",R.drawable.profile_photo,"Manage your account’s security and keep track of your account’s usage including apps that you have connected to your account."),
    DrawerRow("Privacy and safety",R.drawable.profile_photo,"Manage what information you see and share on Twitter."),
    DrawerRow("Notifications",R.drawable.profile_photo,"Select the kinds of notifications you get about your activities, interests, and recommendations."),
    DrawerRow("Accessibility, display and languages",R.drawable.profile_photo,"Manage how Twitter content is displayed to you."),
    DrawerRow("Additional resources",R.drawable.profile_photo,"Check out other places for helpful information to learn more about Twitter products and services.")
)

val tweets = mutableListOf(
    Tweet(
        sudorizwan,
        "This is a test tweet!",
        null,
        495,
        false,
        193,
        false,
        2,
        1587345183868
    ),
    Tweet(
        androiddevs,
        "Kickstart your Kotlin training!\n" +
                "\n" +
                "If you're a #Kotlin newbie, start with our Kotlin Bootcamp for programmers and Android Kotlin Fundamentals courses to learn the basics.",
        R.drawable.profile_photo,
        495,
        true,
        193,
        true,
        2,
        1585852320000
    ),
    Tweet(
        sudorizwan,
        "Another test tweet, but with an image!",
        R.drawable.profile_photo,
        495,
        false,
        193,
        false,
        2,
        1587345183868
    ),
    Tweet(
        sudorizwan,
        "Test tweet 2",
        null,
        495,
        false,
        193,
        false,
        2,
        1585427520000
    ),
    Tweet(
        sudorizwan,
        "Test tweet 3",
        null,
        495,
        false,
        193,
        false,
        2,
        1585427520000
    ),
    Tweet(
        androiddevs,
        "Android Devs test tweet 1",
        null,
        495,
        false,
        193,
        true,
        2,
        1585852320000
    ),
    Tweet(
        androiddevs,
        "Android Devs test tweet 2",
        null,
        495,
        false,
        193,
        true,
        2,
        1585852320000
    )
)