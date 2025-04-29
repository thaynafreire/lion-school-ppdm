package br.senai.sp.jandira.lionschool.screens

import androidx.compose.animation.animateContentSize
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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.motionEventSpy
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.lionschool.R
import br.senai.sp.jandira.lionschool.screens.components.LionSchoolCouses
import br.senai.sp.jandira.lionschool.screens.components.LionSchoolStudents
import java.util.Locale

@Composable
fun StudentsScreen(modifier: Modifier = Modifier){
    Box(
        modifier = Modifier
            .padding(20.dp)
            .fillMaxSize()
            .background(
                color = Color(0xffFFFFFF)
            ),
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.Top
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(90.dp)
                    .padding(top = 20.dp)
                //.background(
                 //color = Color.Magenta
                //)
            ) {
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
                Column (
                    modifier = Modifier
                ){
                    Text(
                        modifier = Modifier
                            .padding(top = 10.dp),
                        text = stringResource(
                            R.string.app_name_lion
                        ),
                        color = Color(0xff3347B0),

                        fontSize = 17.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        modifier = Modifier
                            .padding(top = 2.dp),
                        text = stringResource(
                            R.string.app_name_school
                        ),
                        color = Color(0xff3347B0),

                        fontSize = 17.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
                Row (
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight(),
                    horizontalArrangement = Arrangement.End,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Card(
                        modifier = Modifier
                            .padding(end = 16.dp)
                            .size(55.dp),
                        shape = CircleShape,
                        colors = CardDefaults.cardColors(
                            containerColor = Color(0xffFFC23D)
                        )
                    ) {
                        Box(
                            modifier = Modifier.fillMaxSize(),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = "DS",
                                color = Color(0xff343434),
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Bold
                            )
                        }
                    }
                }


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
                    .height(42.dp)
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
                            R.string.text_field_students
                        ),
                        color = Color(0xffb7b7b7),
                        modifier = Modifier
                            .padding(start = 25.dp),
                        fontSize = 15.sp
                    )
                },
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = Color(0xFFFFBF30),
                    unfocusedBorderColor = Color(0xffFFC23D)
                )
            )
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp)
                    .height(40.dp),
                    //.background(color = Color.Magenta)
                horizontalArrangement = Arrangement.Start
            ){
                Card(
                    modifier = Modifier
                        .width(80.dp)
                        .padding(end = 5.dp),
                    shape = RoundedCornerShape(20.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color(0xff3347B0)
                    )
                ) {
                    Box(
                        modifier = Modifier.fillMaxSize(),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = stringResource(R.string.all_students),
                            color = Color(0xFFFFFFFF),
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }

                }
                Card(
                    modifier = Modifier
                        .width(80.dp)
                        .padding(end = 5.dp),
                    shape = RoundedCornerShape(20.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color(0xffFFC23D)
                    )
                ) {
                    Box(
                        modifier = Modifier.fillMaxSize(),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = stringResource(R.string.studying),
                            color = Color(0xff3347B0),
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }

                }
                Card(
                    modifier = Modifier
                        .width(80.dp),
                    shape = RoundedCornerShape(20.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color(0xffFFC23D)
                    )
                ) {
                    Box(
                        modifier = Modifier.fillMaxSize(),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = stringResource(R.string.conclude),
                            color = Color(0xff3347B0),
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }

                }
            }
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp)

            ){
                Image(
                    modifier = Modifier
                        .size(35.dp),
                    painter = painterResource(
                        R.drawable.lion_graduation
                    ),
                    contentDescription = stringResource(
                        R.string.lion_graduation
                    ),

                )
                Text(
                    modifier = Modifier
                        .padding(5.dp),
                    text = stringResource(R.string.students_list),
                    color = Color(0xff3347B0),
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold

                )
            }
            LionSchoolStudents(
                profile = painterResource(R.drawable.lion_user_luana),
                name = stringResource( R.string.lion_user_name_luana),
                matricula = stringResource( R.string.lion_user_matricula_luana),
                year = stringResource(R.string.lion_user_year_luana)
            )
            LionSchoolStudents(
                profile = painterResource(R.drawable.lion_user_pedro),
                name = stringResource( R.string.lion_user_name_pedro),
                matricula = stringResource( R.string.lion_user_matricula_pedro),
                year = stringResource(R.string.lion_user_year_pedro)
            )
            LionSchoolStudents(
                profile = painterResource(R.drawable.lion_user_luana),
                name = stringResource( R.string.lion_user_name_luana),
                matricula = stringResource( R.string.lion_user_matricula_luana),
                year = stringResource(R.string.lion_user_year_luana)
            )
            LionSchoolStudents(
                profile = painterResource(R.drawable.lion_user_pedro),
                name = stringResource( R.string.lion_user_name_pedro),
                matricula = stringResource( R.string.lion_user_matricula_pedro),
                year = stringResource(R.string.lion_user_year_pedro)
            )
            LionSchoolStudents(
                profile = painterResource(R.drawable.lion_user_luana),
                name = stringResource( R.string.lion_user_name_luana),
                matricula = stringResource( R.string.lion_user_matricula_luana),
                year = stringResource(R.string.lion_user_year_luana)
            )
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun StudentsScreenPreview(){
    StudentsScreen()
}