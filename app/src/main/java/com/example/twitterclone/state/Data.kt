package com.example.twitterclone.state


import com.example.twitterclone.R
import com.example.twitterclone.model.DrawerRow
import com.example.twitterclone.model.Messages
import com.example.twitterclone.model.Tweet
import com.example.twitterclone.model.User


val real_anupreet = User(
    name = "Anupreet Singh",
    username = "real_anupreet",
    avatar = R.drawable.real_anupreet_avatar,
    banner = R.drawable.real_anupreet_banner,
    bio = "Web Developer // Designer // Android Developer",
    following = 500,
    followers = 245,
    verified = false
)

val googledevs = User(
    name = "Google Devs India",
    username = "GoogleDevsIN",
    avatar = R.drawable.googledevs_avatar,
    banner = R.drawable.googledevs_banner,
    bio = "News, updates & events from the Google Developers team in India.",
    following = 284,
    followers = 1000,
    verified = true
)

val messagescontent = mutableListOf(
    Messages(
        "Google Devs India",
        "GoogleDevsIN",
        R.drawable.googledevs_avatar,
        "Hey \uD83D\uDC4B"
    ),
)

val drawerrowcontents = mutableListOf(
    DrawerRow("Profile", R.drawable.profile),
    DrawerRow("Lists", R.drawable.lists),
    DrawerRow("Twitter Circle", R.drawable.twittercircle),
    DrawerRow("Bookmarks", R.drawable.bookmarks),
    DrawerRow("Moments", R.drawable.moments),
    DrawerRow("Monetization", R.drawable.monetization),
    DrawerRow("Settings and Privacy", R.drawable.settings),
)
val settings = mutableListOf(
    DrawerRow(
        "Your Account",
        R.drawable.profile,
        "See information about your account, download an archive of your data, or learn about your account deactivation options"
    ),
    DrawerRow(
        "Security and account access",
        R.drawable.lock,
        "Manage your account’s security and keep track of your account’s usage including apps that you have connected to your account."
    ),
    DrawerRow(
        "Privacy and safety",
        R.drawable.bolt,
        "Manage what information you see and share on Twitter."
    ),
    DrawerRow(
        "Notifications",
        R.drawable.notifications,
        "Select the kinds of notifications you get about your activities, interests, and recommendations."
    ),
    DrawerRow(
        "Accessibility, display and languages",
        R.drawable.display,
        "Manage how Twitter content is displayed to you."
    ),
//    DrawerRow("Additional resources",R.drawable.profile_photo,"Check out other places for helpful information to learn more about Twitter products and services.")
)

val tweets = mutableListOf(
    Tweet(
        real_anupreet,
        "Made this\uD83D\uDE00\uD83E\uDD29\uD83C\uDF80\n" +
                "#ComposeCamp , #ComposeCampIndia  #Google #DeveloperStudentClubs #JetpackCompose \n" +
                "@GoogleDevsin",
        R.drawable.real_anupreet_tweet,
        495,
        193,
        2,
    ),
    Tweet(
        googledevs,
        "Follow your dreams and make it big at Google #DeveloperStudentClubs community! \n" +
                "Former Lead @san_chotik shares her story → http://goo.gle/3UX4Sqh\n" +
                "Tune in to hear Sanjana about her passion for driving inclusivity in tech and growing a thriving GDSC @dsciiest Community.",
        R.drawable.googledevs_tweet,
        495,
        193,
        2,
    ),
    Tweet(
        real_anupreet,
        "Would be travelling around 600+ kilometres for #DevFestJalandhar organized by @GDGJalandhar" +
                " \n" +
                "Really excited! This would be my first in-person developer conference \uD83E\uDD7A\uD83C\uDF1F\n" +
                "Ps: if you would be there, would love to connect with ya!",
        null,
        495,
        193,
        2,
    ),
    Tweet(
        real_anupreet,
        "Test tweet 2",
        null,
        495,
        193,
        2,
    ),
    Tweet(
        real_anupreet,
        "Test tweet 3",
        null,
        495,
        193,
        2,
    ),
    Tweet(
        googledevs,
        "Android Devs test tweet 1",
        null,
        495,
        193,
        2,
    ),
    Tweet(
        googledevs,
        "Android Devs test tweet 2",
        null,
        495,
        193,
        2,
    )
)

fun createmytweet(text: String) {
    tweets.add(
        0,
        Tweet(
            real_anupreet,
            text,
            null,
            0,
            0,
            0
        )
    )
}