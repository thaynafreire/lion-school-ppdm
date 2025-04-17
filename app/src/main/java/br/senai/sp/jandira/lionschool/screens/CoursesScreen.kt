package br.senai.sp.jandira.lionschool.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.lionschool.R

@Composable
fun CoursesScreen(modifier: Modifier = Modifier){
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
            verticalArrangement = Arrangement.Top
        ){
            Row (
                modifier = Modifier
                    .width(140.dp)
                    .height(90.dp)
                    .padding(top = 20.dp)
                //.background(
                   // color = Color.Magenta
                //)
            ){
                Image(
                    modifier = Modifier
                        .size(72.dp),
                    painter = painterResource(
                        R.drawable.logo_lion_school
                    ),
                    contentDescription = stringResource(
                        R.string.logo_lion_school
                    ),
                )
                Text(
                    modifier = Modifier
                        .padding(top = 10.dp),
                    text = stringResource(
                        R.string.title_app_name
                    ),
                    color = Color(0xff3347B0),

                    fontSize = 17.sp,
                    fontWeight = FontWeight.Bold
                )
            }
            Divider(
                color = Color(0xffFFC23D),
                modifier = Modifier
                    .padding(10.dp)
                    .fillMaxWidth()
                    .height(0.8.dp)
            )
            OutlinedTextField(
                value = "",
                onValueChange = {

                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp)
                    .height(50.dp)
                    .background(Color(0xfff5f5f5)),
                shape = RoundedCornerShape(12.dp),
                trailingIcon = {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = null,
                        tint = Color(0xffb7b7b7)
                    )
                },
                label = {
                    Text(
                        text = stringResource(
                            R.string.text_field_courses
                        ),
                        color = Color(0xffb7b7b7),
                        modifier = Modifier
                            .padding(start = 25.dp)
                    )
                }
            )
        }
    }

}

@Preview(showSystemUi = true)
@Composable
private fun CoursesScreenPreview(){
    CoursesScreen()
}

