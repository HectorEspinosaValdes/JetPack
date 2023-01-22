package com.compouseudemy

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
           NewStory()
        }
    }
}

@Composable
private fun NewStory(){
    val image = painterResource(id = R.mipmap.header)

    Column (modifier = Modifier.padding(16.dp)){
        Image(painter = image, contentDescription = "Header")
        Text(text = "Tituloigit")
        Text(text = "Titulo")
        Text(text = "Titulo")
    }
}

@Preview
@Composable
fun PreviewNewStory(){
    NewStory()
}