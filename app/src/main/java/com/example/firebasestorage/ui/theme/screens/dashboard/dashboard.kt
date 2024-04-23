package com.example.firebasestorage.ui.theme.screens.dashboard

import androidx.compose.foundation.Image
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
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.Mangaka.R
import com.example.firebasestorage.ui.theme.nblue

@Composable
fun DashboardScreen(navController: NavHostController){
    Column(modifier = Modifier.fillMaxSize()) {
        val mContext = LocalContext.current
        TopAppBar(title = { Text(text = "Amazon Shop") },
            backgroundColor = nblue)
        //end of TopAppBar

        Spacer(modifier = Modifier.height(30.dp))
        //Beginning of row!
        Row (modifier = Modifier.padding(start = 20.dp)){
            Column {
                Text(text = "Amazon",
                    fontSize = 30.sp,
                    color = nblue, fontFamily = FontFamily.Serif)
                Text(text = "Shop from A to Z")
            }
            Spacer(modifier = Modifier.width(80.dp))
            Image(painter = painterResource(id = R.drawable.tate),
                contentDescription ="amazon",
                modifier = Modifier.size(100.dp))

        }
        Spacer(modifier = Modifier.height(20.dp))
        //End of row!

        Column (modifier = Modifier.padding(start = 20.dp)){
            //Row 1
            Row {
                Card(modifier = Modifier.
                size(width = 160.dp, height = 120.dp),
                    elevation = 20.dp) {
                    Column {
                        Box (modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center){
                            Image(painter = painterResource(id = R.drawable.tate),
                                contentDescription ="amazon",
                                modifier = Modifier.size(50.dp))

                        }
                        Text(text = "Clothing",
                            fontSize = 20.sp,
                            color = Color.Red,
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center)

                    }

                }
                Spacer(modifier = Modifier.width(20.dp))
                //End of card 1
                Card(modifier = Modifier.
                size(width = 160.dp, height = 120.dp),
                    elevation = 20.dp) {
                    Column {
                        Box (modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center){
                            Image(painter = painterResource(id = R.drawable.sukuna),
                                contentDescription ="amazon",
                                modifier = Modifier.size(50.dp))

                        }
                        Text(text = "Electronics",
                            fontSize = 20.sp,
                            color = Color.Blue,
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center)

                    }

                }
                //End of card 2
            }



            //End of Row 1
            Spacer(modifier = Modifier.height(15.dp))
            //Row 2
            Row {
                Card(modifier = Modifier.
                size(width = 160.dp, height = 120.dp),
                    elevation = 20.dp) {
                    Column {
                        Box (modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center){
                            Image(painter = painterResource(id = R.drawable.reversal),
                                contentDescription ="amazon",
                                modifier = Modifier.size(50.dp))

                        }
                        Text(text = "Home",
                            fontSize = 20.sp,
                            color = Color.Blue,
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center)

                    }

                }
                Spacer(modifier = Modifier.width(20.dp))
                //End of card 1
                Card(modifier = Modifier.
                size(width = 160.dp, height = 120.dp),
                    elevation = 20.dp) {
                    Column {
                        Box (modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center){
                            Image(painter = painterResource(id = R.drawable.toji),
                                contentDescription ="amazon",
                                modifier = Modifier.size(50.dp))

                        }
                        Text(text = "Beauty",
                            fontSize = 20.sp,
                            color = Color.Red,
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center)

                    }

                }
                //End of card 2
            }





            //End of Row 2
            Spacer(modifier = Modifier.height(15.dp))

            //Row 3
            Row {
                Card(modifier = Modifier.
                size(width = 160.dp, height = 120.dp),
                    elevation = 20.dp) {
                    Column {
                        Box (modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center){
                            Image(painter = painterResource(id = R.drawable.shibuya),
                                contentDescription ="amazon",
                                modifier = Modifier.size(50.dp))

                        }
                        Text(text = "Pharmacy",
                            fontSize = 20.sp,
                            color = Color.Red,
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center)

                    }

                }
                Spacer(modifier = Modifier.width(20.dp))
                //End of card 1
                Card(modifier = Modifier.
                size(width = 160.dp, height = 120.dp),
                    elevation = 20.dp) {
                    Column {
                        Box (modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center){
                            Image(painter = painterResource(id = R.drawable.mist),
                                contentDescription ="amazon",
                                modifier = Modifier.size(50.dp))

                        }
                        Text(text = "Groceries",
                            fontSize = 20.sp,
                            color = Color.Blue,
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center)

                    }

                }
                //End of card 2
            }




            //End of row 3

        }







    }
}
@Preview(showBackground = true, )
@Composable
fun DashboardScreenPreview(){
    DashboardScreen(rememberNavController())
}