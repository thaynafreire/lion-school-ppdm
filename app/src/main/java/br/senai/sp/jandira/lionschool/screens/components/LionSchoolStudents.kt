package br.senai.sp.jandira.lionschool.screens.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.lionschool.R
import java.time.Year

@Composable
fun LionSchoolStudents(
    profile: Painter,
    name: String = "",
    matricula: String = "",
    year: String = ""
){
    Card (
        modifier = Modifier,
        colors = CardDefaults.cardColors(containerColor = Color.Transparent),
    ){
        Card(
        modifier = Modifier
            .padding(10.dp)
            .fillMaxWidth()
            .height(80.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color(0xff9FA9E1)
        )
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxSize()
        ) {
            Box(
                modifier = Modifier
                    .width(15.dp)
                    .fillMaxHeight()
                    .background(Color(0xffFFC23D))
                    .padding(start = 10.dp, end = 10.dp)
            )
            Card(
                modifier = Modifier
                    .size(75.dp)
                    .padding(10.dp),
                shape = CircleShape
            ) {
                Image(
                    painter = profile,
                    contentDescription = stringResource(R.string.lion_user_luana),
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxSize()
                )
            }
            Column (
                modifier = Modifier
            ){
                Text(
                    modifier = Modifier,
                    text = name,
                    color = Color(0xffFFFFFF),
                    fontSize = 16.sp,
                    fontWeight = FontWeight.SemiBold
                )
                Row (
                    modifier = Modifier
                        .padding(2.dp)
                ){
                    Image(
                        painter = painterResource(R.drawable.user),
                        contentDescription = stringResource(R.string.lion_user),
                        modifier = Modifier
                            .size(15.dp)
                    )
                    Text(
                        modifier = Modifier
                            .padding(top = 2.dp)
                            .padding(start = 2.dp),
                        text = matricula,
                        color = Color(0xffFFFFFF),
                        fontSize = 10.sp,
                        fontWeight = FontWeight.Light

                    )
                }
            }
            Row (
                modifier = Modifier
                    .padding(start = 40.dp)
                    .padding(top = 50.dp),
            ){
                Icon(
                    modifier = Modifier
                        .size(12.dp),
                    imageVector = Icons.Default.DateRange,
                    contentDescription = null,
                    tint = Color(0xffFFFFFF)
                )
                Text(
                    modifier = Modifier
                        .padding(start = 2.dp),
                    text = year,
                    color = Color(0xffFFC23D),
                    fontSize = 10.sp,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    } }

}

//@Preview
//@Composable
//private fun LionSchoolStudentsPreview(){
    //LionSchoolStudents()
//}