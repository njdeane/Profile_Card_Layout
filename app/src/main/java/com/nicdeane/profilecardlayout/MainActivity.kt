package com.nicdeane.profilecardlayout

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.nicdeane.profilecardlayout.ui.theme.MyTheme
import com.nicdeane.profilecardlayout.ui.theme.profileImageGreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyTheme {
                MainScreen()
            }
        }
    }
}

@Composable
fun MainScreen() {
    Scaffold(topBar = { AppBar() }) {
        Surface(
            modifier = Modifier.fillMaxSize(),
        ) {
            Column {
                ProfileCard(userList[0])
                ProfileCard(userList[1])
            }

        }
    }
}

@Composable
fun AppBar() { // color is coming from Theme.kt primary color
    TopAppBar(
        navigationIcon = {
            Icon(
                Icons.Default.Menu, contentDescription = "Menu",
                Modifier.padding(horizontal = 12.dp)
            )
        },
        title = { Text(text = "Disney Pirates") },
        elevation = 0.dp // gets rid of app bar line somewhat but how to make invisible?
    )
}

@Composable
fun ProfileCard(userProfile: UserProfile) {
    Card(
        // changed corner radius via changing Shape.kt medium which is the default
        modifier = Modifier
            .padding(top = 8.dp, bottom = 4.dp, start = 16.dp, end = 16.dp)
            .fillMaxWidth() // how to change shadow color?
            .wrapContentHeight(align = Alignment.Top),
        elevation = 8.dp,
        backgroundColor = Color.White,
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start
        ) {
            ProfilePicture(userProfile.drawableID, userProfile.status)
            ProfileContent(userProfile.name, userProfile.status)
        }
    }
}

@Composable
fun ProfileContent(userName: String, status: Boolean) {
    Column(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth()
    ) {
        Text(
            text = userName,
            style = MaterialTheme.typography.h5
        )
        CompositionLocalProvider(LocalContentAlpha provides ContentAlpha.medium) {
            Text(
                text = if (status) "Active" else "Offline",
                style = MaterialTheme.typography.body2
            )
        }

    }
}

@Composable
fun ProfilePicture(drawableId: Int, status: Boolean) {
    Card(
        shape = CircleShape,
        border = BorderStroke(
            2.dp,
            color = if (status) {
                profileImageGreen // Compose might not need the curly braces, should I put in or not?
            } else {
                Color.Red
            }
        ),
        modifier = Modifier.padding(16.dp),
    ) {
        Image(
            painter = painterResource(drawableId),
            contentDescription = "Profile Image",
            modifier = Modifier.size(72.dp),
            contentScale = ContentScale.Crop
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyTheme {
        MainScreen()
    }
}