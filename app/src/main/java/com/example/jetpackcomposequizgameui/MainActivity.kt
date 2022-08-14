package com.example.jetpackcomposequizgameui

import android.os.Bundle
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.fontResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposequizgameui.ui.theme.JetpackComposeQuizGameUITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeQuizGameUITheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {

                }

                questionText(question = "Who is the tallest member of the office?")

                Column(

                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight()
                    ,
                    Arrangement.Center,
                    Alignment.CenterHorizontally


                ) {

                    QuestionButtons("Kevin")
                    QuestionButtons(question = "Kelly")
                    QuestionButtons(question = "Ryan")
                    QuestionButtons(question = "Pam")

                }




            }
        }
    }
}




@Composable
fun QuestionButtons(question : String)
{
    Button(onClick = { /*TODO*/ },
        modifier = Modifier
            .fillMaxWidth(.6f)
            .height(100.dp)
            .padding(4.dp)
    )
    {
        Text(text = question, fontSize = 25.sp)
    }


}

@Composable
fun questionText(question : String)
{
    Box(modifier = Modifier
        .padding(70.dp)
        .padding(end = 10.dp, start = 10.dp)
        .fillMaxWidth()

    ) {

        Text(
            text = question, fontSize = 25.sp, textAlign = TextAlign.Center
        )
    }

}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetpackComposeQuizGameUITheme {
        questionText(question = "Who is the tallest member of the office?")

        Column(

            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
            ,
            Arrangement.Center,
            Alignment.CenterHorizontally


        ) {

            QuestionButtons("Kevin")
            QuestionButtons(question = "Kelly")
            QuestionButtons(question = "Ryan")
            QuestionButtons(question = "Pam")

        }
    }
}