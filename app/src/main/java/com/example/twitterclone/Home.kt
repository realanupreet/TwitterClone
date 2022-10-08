package com.example.twitterclone

import android.net.Uri
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavGraph.Companion.findStartDestination
import com.example.twitterclone.model.Tweet
import com.example.twitterclone.model.User
import com.example.twitterclone.state.tweets
import com.google.gson.Gson

@Composable
fun ScreenHome(navController: NavController? = null) {

    CommonScaffold(navController) {
        Surface() {
            LazyColumn() {
                items(tweets) { tweet ->
                    TweetLayout(tweet, navController)

                }
            }
            Spacer(modifier = Modifier.height(50.dp))
//            modifier = Modifier.fillMaxSize(),
//            verticalArrangement = Arrangement.Center,
//            horizontalAlignment = Alignment.CenterHorizontally


        }
    }
//        NavigationController(navController = navController)
//        ScreenHome(navController)


}

@Composable
fun TweetLayout(tweet: Tweet, navController: NavController?) {
//    Text(text = "$tweet")
    Row(modifier = Modifier.padding(all = 10.dp)) {
        UserAvatar(tweet, navController)
        Spacer(modifier = Modifier.size(12.dp))
        Column {
            NameAndUserName(tweet)
            Spacer(modifier = Modifier.size(1.dp))
            TweetAndImage(tweet)
            Spacer(modifier = Modifier.size(10.dp))
            TweetActions(tweet)
        }

    }
    Divider()
}

@Composable
fun UserAvatar(tweet: Tweet, navController: NavController?) {

    Image(
        painterResource(tweet.user.avatar),
        modifier = Modifier
            .size(50.dp)
            .clip(shape = RoundedCornerShape(25.dp))
            .clickable {
                val json = Uri.encode(Gson().toJson(tweet.user))
                navController?.navigate("profile/$json") {
                    popUpTo(navController.graph.findStartDestination().id) {
                        saveState = true
                    }
                    launchSingleTop = true
                    restoreState = true
                }
            },
        contentScale = ContentScale.Crop,
        contentDescription = null
    )
}

@Composable
fun TweetActions(tweet: Tweet) {
    Row(
        modifier = Modifier.padding(0.dp,0.dp,15.dp,0.dp).fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Image(
                painter = painterResource(
                    R.drawable.profile_photo
                ),
                contentDescription = null,
                modifier = Modifier.size(20.dp)
            )
            Text(text = tweet.comments.toString(), color = Color.Gray)
        }
        Row(verticalAlignment = Alignment.CenterVertically) {
            Image(
                painter = painterResource(
                    R.drawable.profile_photo
                ),
                contentDescription = null,
                modifier = Modifier.size(20.dp)
            )
            Text(text = tweet.retweets.toString(), color = Color.Gray)
        }
        Row(verticalAlignment = Alignment.CenterVertically) {
            Image(
                painter = painterResource(
                    R.drawable.profile_photo
                ),
                contentDescription = null,
                modifier = Modifier.size(20.dp)
            )
            Text(text = tweet.likes.toString(), color = Color.Gray)
        }
        Row(verticalAlignment = Alignment.CenterVertically) {
            Image(
                painter = painterResource(
                    R.drawable.profile_photo
                ),
                contentDescription = null,
                modifier = Modifier.size(20.dp)
            )
        }

    }
}

@Composable
fun NameAndUserName(tweet: Tweet) {
    Row {
        Text(text = "${tweet.user.name} ", fontWeight = FontWeight.Bold, color = Color.Black)
        if (tweet.user.verified) {
            Image(
                painter = painterResource(id = R.drawable.profile_photo),
                contentDescription = null,
                Modifier.size(20.dp)
            )
        }

        Text(text = " @", color = Color.Gray)
        Text(text = tweet.user.username, color = Color.Gray)
    }
}

@Composable
fun TweetAndImage(tweet: Tweet) {
    Text(text = tweet.tweet, color = Color.Black)
    if (tweet.image != null) {
        Image(
            painterResource(tweet.image),
            modifier = Modifier
//                .size(180.dp)
               .padding(0.dp,0.dp,15.dp,0.dp)
                .clip(shape = RoundedCornerShape(5.dp))
                .fillMaxWidth()
                .height(180.dp),

            contentScale = ContentScale.Crop,
            contentDescription = null
        )
    }


}

@Preview
@Composable
fun MainPreview4() {
    ScreenHome()
}