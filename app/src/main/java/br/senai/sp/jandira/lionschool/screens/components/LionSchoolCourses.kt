package br.senai.sp.jandira.lionschool.screens.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.lionschool.R

@Composable
fun LionSchoolCouses(
    acronym: String = "",
    titlecourse: String = "",
    descriptioncourse: String = "",
    termcourse: String = "",
    image: Painter
) {
    Card (
        modifier = Modifier
            .width(290.dp)
            .height(180.dp)
            .padding(5.dp),

        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(containerColor = Color.Transparent),
    ){
        Box(
            modifier = Modifier
                .fillMaxSize()
                .border(
                    width = 1.dp,
                    color = Color(0xffffc23d),
                    shape = RoundedCornerShape(12.dp)
                )
                .background(
                    brush = Brush.horizontalGradient(
                        colors = listOf(
                            Color(0xff3347b0),
                            Color(0xffcfd4ea)
                        )
                    ),
                    shape = RoundedCornerShape(12.dp)

                )

        ){
            Column (
                modifier = Modifier
                    .padding(15.dp)
            ){
                Row (
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(85.dp)
                ){
                    Image(
                        modifier = Modifier
                            .size(85.dp),
                        painter = image,
                        contentDescription = stringResource(
                            R.string.lion_ds
                        ),
                    )
                    Text(
                        modifier = Modifier
                            .padding(top = 15.dp)
                            .padding(start = 22.dp),
                        text = acronym,
                        color = Color(0xffFFC23D),
                        fontSize = 55.sp,
                        fontWeight = FontWeight.Bold
                    )

                }
                Text(
                    modifier = Modifier
                        .padding(top = 5.dp),
                    text = titlecourse,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFFFFFFFF),
                    fontSize = 14.sp
                )
                Text(
                    modifier = Modifier
                        .padding(top = 2.dp),
                    text = descriptioncourse,
                    fontSize = 8.sp,
                    color = Color(0xFFFFFFFF),
                )
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 13.dp),
                    verticalAlignment = Alignment.Bottom,
                    horizontalArrangement = Arrangement.Start
                ){
                    Icon(
                        modifier = Modifier
                            .size(12.dp),
                        imageVector = Icons.Default.Info,
                        contentDescription = "",
                        tint = (Color(color = 0xFFFFC23D))
                    )
                    Text(
                        modifier = Modifier
                            .padding(bottom = 2.dp)
                            .padding(start = 5.dp),
                        text = termcourse,
                        color = Color(0xFFFFFFFF),
                        fontSize = 7.sp
                    )
                }
            }

        }

    }
}

//@Preview
//@Composable
//private fun LionSchoolCousesPreview(){
    //LionSchoolCouses()
//}