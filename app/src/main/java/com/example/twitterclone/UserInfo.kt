package com.example.twitterclone

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.twitterclone.model.User

@Composable
fun UserInfo(user: User?, showBio: Boolean = false) {
    Column(Modifier.padding(15.dp)) {
        if (user != null){
            Text(text = user.name, color = Color.Black, fontWeight = FontWeight.Bold, fontSize = 25.sp)
            Text(text = "@${user.username}", color = Color.Gray)
            if (showBio) {
                Text(text = user.bio)
            }
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(0.dp,5.dp,0.dp,5.dp)
            ) {
                Text(text = "${ user.following }", fontWeight = FontWeight.Bold)
                Text(text = " Following   ")
                Text(text = "${ user.followers }", fontWeight = FontWeight.Bold)
                Text(text = " Followers ")
            }
        }
    }



}