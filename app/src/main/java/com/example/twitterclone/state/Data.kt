package com.example.twitterclone.state


import com.example.twitterclone.R
import com.example.twitterclone.model.DrawerRow
import com.example.twitterclone.model.Tweet
import com.example.twitterclone.model.User


val real_anupreet = User(
    name = "Anupreet Singh",
    username = "real_anupreet",
    avatar = R.drawable.profile_photo,
    banner = R.drawable.profile_photo,
    bio = "Web Developer // Designer // Android Developer",
    following = 500,
    followers = 245,
    verified = false
)

val googledevs = User(
    name = "Google Devs India",
    username = "GoogleDevsIN",
    avatar = R.drawable.profile_photo,
    banner = R.drawable.profile_photo,
    bio = "News, updates & events from the Google Developers team in India.",
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
        real_anupreet,
        "Made this\uD83D\uDE00\uD83E\uDD29\uD83C\uDF80\n" +
                "#ComposeCamp , #ComposeCampIndia  #Google #DeveloperStudentClubs #JetpackCompose \n" +
                "@GoogleDevsin",
        null,
        495,
        false,
        193,
        false,
        2,
        1587345183868
    ),
    Tweet(
        googledevs,
        "Follow your dreams and make it big at Google #DeveloperStudentClubs community! \n"+
                "Former Lead @san_chotik shares her story → http://goo.gle/3UX4Sqh\n" +
                "Tune in to hear Sanjana about her passion for driving inclusivity in tech and growing a thriving GDSC @dsciiest Community.",
        R.drawable.profile_photo,
        495,
        true,
        193,
        true,
        2,
        1585852320000
    ),
    Tweet(
        real_anupreet,
        "Would be travelling around 600+ kilometres for #DevFestJalandhar organized by @GDGJalandhar" +
                " \n" +
                "Really excited! This would be my first in-person developer conference \uD83E\uDD7A\uD83C\uDF1F\n" +
                "Ps: if you would be there, would love to connect with ya!",
        R.drawable.profile_photo,
        495,
        false,
        193,
        false,
        2,
        1587345183868
    ),
    Tweet(
        real_anupreet,
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
        real_anupreet,
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
        googledevs,
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
        googledevs,
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