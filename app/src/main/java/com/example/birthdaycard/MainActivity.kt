package com.example.birthdaycard

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.birthdaycard.ui.theme.BirthdayCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BirthdayCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    imgFun("Android", from = "SJY")
                }
            }
        }
    }
}

@Composable
fun imgFun(name: String, from: String) {
    Box {
        val img = painterResource(id = R.drawable.androidparty)
        androidx.compose.foundation.Image(painter = img, contentDescription = null, modifier = Modifier.fillMaxSize(), contentScale = ContentScale.Crop)
        Greeting(name = name, from = from)
    }
}
@Composable
fun Greeting(name: String, from: String) {
    Column (modifier = Modifier.padding(10.dp)){
        Text(text = "Happy Birthday $name!", fontSize = 30.sp, modifier = Modifier.fillMaxWidth().wrapContentWidth(align = Alignment.Start).padding(start = 5.dp, top = 5.dp))
        Text(text = "- By $from", fontSize = 24.sp, modifier = Modifier.fillMaxWidth().wrapContentWidth(align = Alignment.End).padding(end = 5.dp, top = 5.dp))
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BirthdayCardTheme {
        imgFun(name = stringResource(R.string.bd_name), from = stringResource(R.string.from_whom))
    }
}