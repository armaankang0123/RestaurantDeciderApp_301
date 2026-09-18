package com.example.decisionmakingapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.decisionmakingapp.ui.theme.DecisionMakingappTheme
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.background
import kotlin.random.Random
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            var bgColor by remember { mutableStateOf(Color.White) }
            var answer by remember {mutableStateOf("Yet to make....")}
            var clicks by remember { mutableStateOf(0) }


            Column(modifier = Modifier.fillMaxSize().background(bgColor),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = " \uD83C\uDF74Restaurant Decision Maker\uD83C\uDF74 ", fontSize = 27.sp , fontWeight = FontWeight.ExtraBold)
                Spacer(modifier = Modifier.height(10.dp))
                Text(text = "Decision: $answer", fontSize = 20.sp )
                Spacer(modifier = Modifier.height(16.dp))
                Button(onClick = { clicks++
                    val num = Random.nextInt(100)

                    if (num<50){
                        answer= "Let's go!!!"
                        bgColor = Color(0xFF4CAF50)
                    }
                    else{

                        answer= "Don't go.."
                        bgColor = Color(0xFFF44336)
                    }
                }) {
                    Text(text = "YAY!!")

                }
                Spacer(modifier = Modifier.height(10.dp))
                Button(onClick = {clicks++

                    val num = Random.nextInt(100)
                    if (num<25){
                        answer= "Let's go!!!"
                        bgColor = Color(0xFF4CAF50)
                    }else{
                        answer= "Skip! Maybe next time.."
                        bgColor = Color(0xFFF44336)
                    }
                }) {
                    Text(text = "MAYBE...")
                }
                Spacer(modifier = Modifier.height(10.dp))
                Button(onClick = {clicks++
                    val num = Random.nextInt(100)

                    if (num<10){
                        answer= "Let's go!!!"
                        bgColor = Color(0xFF4CAF50)
                    } else{
                        answer= "Don't go.."
                        bgColor = Color(0xFFF44336)
                    }
                }) {
                    Text(text = "NAH!!!")

                }
                Spacer(modifier = Modifier.height(10.dp))
                Text(text = "Clicks counter: $clicks")
                Spacer(modifier = Modifier.height(100.dp))


            }
        }

    }
}