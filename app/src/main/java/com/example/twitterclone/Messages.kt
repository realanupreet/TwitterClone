package com.example.twitterclone

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.twitterclone.model.Messages
import com.example.twitterclone.state.messagescontent
import com.example.twitterclone.state.settings
import com.example.twitterclone.state.tweets

@Composable
fun Messages(navController: NavController? = null,viewModel: MyViewModel?) {

    Surface() {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Scaffold(bottomBar = {
                mybottombar(navController = navController)
            },
                topBar = {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(10.dp)
                    ) {
                        Column(
                            Modifier
                                .size(87.dp)
                                .clip(RoundedCornerShape(200.dp))
                                .background(Color.White),
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.real_anupreet_avatar),
                                contentDescription = null,
                                modifier = Modifier
                                    .size(30.dp)
                                    .clip(CircleShape),
                                contentScale = ContentScale.Crop,
                            )
                        }
                        if (viewModel != null) {
                            OutlinedTextField(
                                value = viewModel.searchMessageText,
                                onValueChange = { viewModel.onSearchMessageTextChange(it) },
                                placeholder = {
                                    Row(
                                        horizontalArrangement = Arrangement.Center,
                                        verticalAlignment = Alignment.CenterVertically
                                    ) {
                                        Icon(Icons.Default.Search, contentDescription = null)
                                        Text(text = "Search", textAlign = TextAlign.Center)
                                    }

                                },
                                modifier = Modifier
                                    .width(230.dp),
                                shape = RoundedCornerShape(50.dp),

                                )
                        }
//                        IconButton(onClick = { navController?.navigate("settings") }) {
                            Image(painterResource(R.drawable.settings), contentDescription =null , modifier = Modifier.size(30.dp).weight(1f))

                    }
                }) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.padding(10.dp)
                ) {
                    LazyColumn(Modifier.padding(10.dp)) {
                        items(messagescontent) { content ->
                            ShowMessage(
                                name = content.name,
                                username = content.username,
                                avatar = content.avatar,
                                message = content.message
                            )
                        }

                    }
                }


            }

        }

    }

}

@Composable
fun ShowMessage(
    name: String,
    username: String,
    @DrawableRes avatar: Int,
    message: String
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Image(
            painter = painterResource(id = avatar),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(30.dp)
        )

        Column(Modifier.padding(30.dp, 10.dp, 10.dp, 10.dp)) {
            Row {
                Text(text = name, fontSize = 17.sp)

                Text(text = "@$username", fontSize = 17.sp, color = Color.Gray)
            }
            if (message != null) {
                Text(text = message)
            }
        }
    }
    Divider()
}

@Preview
@Composable
fun MainPreviewmes() {
    Messages(viewModel=null)
}