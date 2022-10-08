package com.example.twitterclone

import android.R.attr.*
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.FocusRequester.Companion.createRefs
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.navigation.NavController
import com.example.twitterclone.model.User
import com.example.twitterclone.state.tweets
import kotlinx.coroutines.NonDisposableHandle
import kotlinx.coroutines.NonDisposableHandle.parent


@Composable
fun Profile(navController: NavController? = null, user: User?) {

    Surface() {
        Column(
            Modifier
                .verticalScroll(rememberScrollState())
                .fillMaxSize()
        ) {
            ConstraintLayout() {
                val (banner, closeButton, moreButton, avatar, content, followButton) = createRefs()

                Box(modifier = Modifier.constrainAs(banner) {

                }) {
                    Banner(user)
                }
                Box(
                    modifier = Modifier
                        .constrainAs(avatar) {
                            bottom.linkTo(banner.bottom, -20.dp)
                        }
                        .padding(5.dp, 5.dp, 5.dp, 5.dp)
                        .offset(0.dp, 20.dp)

                ) {

                    Avatar(user)
                }
                Box(modifier = Modifier.constrainAs(content) {
                    top.linkTo(avatar.bottom)
                }) {
                    ProfileContent(user, navController)
                }
                TopBar(navController)
                Box(modifier = Modifier.constrainAs(followButton) {
                    end.linkTo(banner.end,5.dp)
                    top.linkTo(banner.bottom)
                }) {
                    FollowButton()
                }


            }
        }
    }

}

@Composable
fun Banner(user: User?) {
    if (user != null) {
        Image(
            painter = painterResource(id = user.banner),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth()
                .height(150.dp)
        )
    }
}

@Composable
fun FollowButton() {
    Button(onClick = { /*TODO*/ }, shape = RoundedCornerShape(20.dp), colors = ButtonDefaults.buttonColors(backgroundColor = Color(
        0xFF03A9F4
    )
    )) {
        Text(text = "Follow")
    }
}

@Composable
fun TopBar(navController: NavController?) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        IconButton(
            modifier = Modifier,
            onClick = {
                navController?.navigate("screenhome")
            }) {
            Icon(Icons.Filled.ArrowBack, contentDescription = null, tint = Color.White)
        }

        IconButton(modifier = Modifier, onClick = {}) {
            Icon(Icons.Filled.MoreVert, contentDescription = null, tint = Color.White)
        }

    }
}

@Composable
fun Avatar(user: User?) {
    if (user != null) {

        Column(
            Modifier
                .size(87.dp)
                .clip(RoundedCornerShape(200.dp))
                .background(Color.White),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = user.avatar),
                contentDescription = null,
                modifier = Modifier
                    .size(80.dp)
//
                    .clip(CircleShape),
                contentScale = ContentScale.Crop,
            )
        }

    }
}

@Composable
fun ProfileContent(user: User?, navController: NavController?) {
    Column {
        Spacer(modifier = Modifier.height(5.dp))
        Column {
            UserInfo(user, true)
        }
        Divider()
        tweets.filter { it.user == user }.forEach { tweet ->
            TweetLayout(tweet, navController)
        }
    }
}


//
//@Preview
//@Composable
//fun MainPreviewp(){
//    Profile()
//}