package com.example.firebasestorage.ui.theme.screens.clothing

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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.Mangaka.R
import com.example.firebasestorage.ui.theme.nblue

@Composable
fun ClothingScreen(navController: NavHostController) {
    Column(modifier = Modifier.fillMaxSize()) {
        val mContext = LocalContext.current
        TopAppBar(
            title = { Text(text = "Clothing Section") },
            backgroundColor = nblue
        )
        //end of top app bar

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp),
            contentAlignment = Alignment.BottomStart
        ) {
            Image(
                painter = painterResource(id = R.drawable.tate), contentDescription = "Seychelles",
                modifier = Modifier
                    .fillMaxSize(),
                contentScale = ContentScale.Crop
            )
            Column {
                Text(
                    text = "WINTER COLLECTION",
                    fontSize = 30.sp,
                    color = Color.Red,
                    fontWeight = FontWeight.ExtraBold
                )
                Text(
                    text = "Purchase your products",
                    fontSize = 20.sp,
                    color = Color.Red
                )
            }

        }

        Spacer(modifier = Modifier.height(20.dp))
        //End of box

        Column(
            modifier = Modifier
                .verticalScroll(rememberScrollState())
                .padding(start = 20.dp)
        ) {
            //Row 1
            Row {
                //Column 1
                Column {
                    Image(
                        painter = painterResource(id = R.drawable.gsock),
                        contentDescription = "Women's",
                        modifier = Modifier.size(width = 180.dp, height = 200.dp)
                    )
                    Text(
                        text = "Women's Collection",
                        fontSize = 20.sp,
                    )
                    Row {
                        OutlinedButton(onClick = { /*TODO*/ }) {
                            Text(text = "See More")
                            OutlinedButton(onClick = {  val simToolKitLaunchIntent =
                                mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                                simToolKitLaunchIntent?.let { mContext.startActivity(it) } }) {
                                Text(text = "Pay")
                            }


                        }

                    }
                    Spacer(modifier = Modifier.width(20.dp))
                    //End of column 1
                    //Column 2
                    Column {
                        Image(
                            painter = painterResource(id = R.drawable.sukuna),
                            contentDescription = "Women's",
                            modifier = Modifier.size(width = 180.dp, height = 200.dp)
                        )
                        Text(
                            text = "Designer",
                            fontSize = 20.sp,
                        )
                        Row {
                            OutlinedButton(onClick = { /*TODO*/ }) {
                                Text(text = "See More")
                                OutlinedButton(onClick = { val simToolKitLaunchIntent =
                                    mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                                    simToolKitLaunchIntent?.let { mContext.startActivity(it) } }) {
                                    Text(text = "Pay")
                                }

                            }
                        }

                    }

                }
                Spacer(modifier = Modifier.height(20.dp))
                //End of Row 1
                //Row 2
                Column(
                    modifier = Modifier
                        .verticalScroll(rememberScrollState())
                        .padding(start = 20.dp)
                ) {
                    Row {
                        //Column 1
                        Column {
                            Image(
                                painter = painterResource(id = R.drawable.shibuya),
                                contentDescription = "Women's",
                                modifier = Modifier.size(width = 180.dp, height = 200.dp)
                            )
                            Text(
                                text = "Children's Section",
                                fontSize = 20.sp,
                            )
                            Row {
                                OutlinedButton(onClick = { /*TODO*/ }) {
                                    Text(text = "See More")
                                    OutlinedButton(onClick = {  val simToolKitLaunchIntent =
                                        mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                                        simToolKitLaunchIntent?.let { mContext.startActivity(it) } }) {
                                        Text(text = "Pay")
                                    }


                                }

                            }
                            Spacer(modifier = Modifier.width(20.dp))
                            //End of column 1
                            //Column 2
                            Column {
                                Image(
                                    painter = painterResource(id = R.drawable.reversal),
                                    contentDescription = "Women's",
                                    modifier = Modifier.size(width = 180.dp, height = 200.dp)
                                )
                                Text(
                                    text = "T-Shirts",
                                    fontSize = 20.sp,
                                )
                                Row {
                                    OutlinedButton(onClick = { /*TODO*/ }) {
                                        Text(text = "See More")
                                        OutlinedButton(onClick = {  val simToolKitLaunchIntent =
                                            mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                                            simToolKitLaunchIntent?.let { mContext.startActivity(it) }}) {
                                            Text(text = "Pay")
                                        }
                                    }
                                }

                            }
                        }

                    }


                }
            }
        }
    }
}






@Preview(showBackground = true)
@Composable
fun ClothingScreenPreview() {
    ClothingScreen(rememberNavController())

}
