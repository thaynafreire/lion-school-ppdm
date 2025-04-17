package br.senai.sp.jandira.lionschool.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.lionschool.R

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier
            .padding(20.dp)
            .fillMaxSize()
            .background(
                color = Color(0xffFFFFFF)
            ),
    ){
        Column (
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ){
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .height(260.dp)
                    .padding(top = 60.dp)
                    //.background(
                      //  color = Color.Magenta
                    //)
            ){
                Image(
                    modifier = Modifier
                        .size(180.dp),
                    painter = painterResource(
                        R.drawable.logo_lion_school
                    ),
                    contentDescription = stringResource(
                        R.string.logo_lion_school
                    ),
                )
                Text(
                    modifier = Modifier
                        .padding(top = 25.dp),
                    text = stringResource(
                        R.string.title_app_name
                    ),
                    color = Color(0xff3347B0),
                    fontSize = 42.sp,
                    fontWeight = FontWeight.Bold
                )
            }
            Text(
                modifier = Modifier
                    .padding(top = 80.dp)
                    .padding(bottom = 12.dp),

                text = stringResource(
                    R.string.title_homescreen
                ),
                color = Color(0xff3347B0),
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold
            )
            Card (
                modifier = Modifier
                    .width(70.dp)
                    .height(7.dp),
                colors = CardDefaults
                    .cardColors(
                        containerColor = Color(0xffFFC23D)
                    )
            ){  }
            Text(
                modifier = Modifier
                    .padding(top = 10.dp)
                    .padding(23.dp),
                text = stringResource(
                    R.string.subtitle_homescreen
                ),
                textAlign = TextAlign.Center,
                color = Color(0xff9E9FA4),
                fontSize = 17.sp,
                fontWeight = FontWeight.W400
            )
            Button(
                modifier = Modifier
                    .padding(top = 90.dp)
                    .width(240.dp)
                    .height(45.dp),
                onClick = {},
                shape = RoundedCornerShape(15.dp),
                colors = ButtonDefaults.buttonColors(
                    Color(0xffFFC23D)
                ),
                border = BorderStroke(
                    2.dp,
                    color = Color(0xff3347B0))
            ) {
                Text(
                    modifier = Modifier,
                    color = Color(0xff3347B0),
                    fontSize = 16.sp,
                    text = stringResource(
                        R.string.button_start_homescreen
                    )
                )
            }
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 122.dp)
                    .padding(start = 30.dp)
                    .height(35.dp)
                    //.background(
                        //color = Color.Magenta
                    //)
            ){
                Image(
                    modifier = Modifier
                        .size(70.dp),
                    painter = painterResource(
                        R.drawable.lion_youtube
                    ),
                    contentDescription = stringResource(
                        R.string.logo_youtube
                    ),
                )
                Image(
                    modifier = Modifier
                        .size(70.dp),
                    painter = painterResource(
                        R.drawable.lion_twitter
                    ),
                    contentDescription = stringResource(
                        R.string.logo_twitter
                    ),
                )
                Image(
                    modifier = Modifier
                        .size(70.dp),
                    painter = painterResource(
                        R.drawable.lion_instagram
                    ),
                    contentDescription = stringResource(
                        R.string.logo_instagram
                    ),
                )
                Image(
                    modifier = Modifier
                        .size(70.dp),
                    painter = painterResource(
                        R.drawable.lion_facebook
                    ),
                    contentDescription = stringResource(
                        R.string.logo_facebook
                    ),
                )
            }


        }
    }
}



@Preview(showSystemUi = true)
@Composable
private fun HomeScreenPreview(){
    HomeScreen()
}