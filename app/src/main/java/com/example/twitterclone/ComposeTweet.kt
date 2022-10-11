package com.example.twitterclone

import android.graphics.drawable.Icon
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalOf
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.twitterclone.state.createmytweet

@Composable
fun ComposeTweet(navController: NavController? = null,viewModel: MyViewModel?) {
//    var tweetText by remember {
//        mutableStateOf("")
//    }
    Surface() {
        Column(
            modifier = Modifier.fillMaxSize(),
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(15.dp),
                Arrangement.SpaceBetween
            ) {
                IconButton(onClick = { navController?.navigate("screenhome") }) {
                    Icon(Icons.Default.Close, contentDescription = null)
                }
                if (viewModel != null) {
                    Button(
                        onClick = {
                            if (viewModel != null) {
                                createmytweet(viewModel.tweetText)
                            }
                            navController?.navigate("screenhome")
                        },
                        modifier = Modifier.padding(end =10.dp),
                        shape = RoundedCornerShape(20.dp),
                        colors = if (viewModel.tweetText.isNotEmpty()) ButtonDefaults.buttonColors(
                            backgroundColor = Color(
                                0xFF03A9F4
                            )
                        ) else ButtonDefaults.buttonColors(
                            backgroundColor = Color(
                                0xFFBDBDBD
                            )
                        ),
                        enabled = viewModel.tweetText.isNotEmpty()
                    ) {
                        Text("Tweet")
                    }
                }
            }
            if (viewModel != null) {
                Avatartextfield(viewModel.tweetText, {
                    viewModel.onTweetChange(it)
                })
            }
        }
    }
}

@Composable
fun Avatartextfield(tweetText: String, onchange: (String) -> Unit) {
    Row(modifier = Modifier.padding(20.dp)) {
        Image(
            painter = painterResource(id = R.drawable.real_anupreet_avatar),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .clip(
                    RoundedCornerShape(40.dp)
                )
                .size(50.dp)
        )
        Spacer(modifier = Modifier.width(20.dp))
        TextField(
            value = tweetText,
            onValueChange = onchange,
            placeholder = { Text(text = "write your tweet") },
            modifier = Modifier.fillMaxSize(),
            colors = TextFieldDefaults.textFieldColors(backgroundColor = Color.White)
        )
    }
}

//@Preview
//@Composable
//fun MainPreviewc() {
//    ComposeTweet()
//}