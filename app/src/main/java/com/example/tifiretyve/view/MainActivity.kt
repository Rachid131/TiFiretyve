package com.example.tifiretyve.view

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.tifiretyve.ui.theme.TiFiretyveTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp(){
                Greeting(name = "Android")
            }
        }
    }
}

@Composable
fun MyApp(content: @Composable () -> Unit) {
    TiFiretyveTheme {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colors.background
        ) {
            content()
        }
    }
}

//should have the text of the current question
@Composable
fun question(){
    /*TODO*/
}


//should hold 4 buttons at a time, and have its text/visibility changable
@Composable
fun answerButtonReel(){
    /*TODO*/
}

//should have the logic for a button to an answer
@Composable
fun answerButton(text: String){
    Button(onClick = { /*TODO*/ }) {
        Text(
            text = text
        )
    }
}

//should hold 3 buttons for the lifelines
@Composable
fun lifelineReel(){
    /*TODO*/
}

//should hold 3 buttons for the lifelines
@Composable
fun lifelineButton(){
    /*TODO*/
}

//playerHud. Holds lives, and points
@Composable
fun playerHud(){
    /*TODO*/
}

@Composable
fun postGameText(text: String) {
    Text(text = text)
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyApp {
        Greeting(name = "Android")
    }
}