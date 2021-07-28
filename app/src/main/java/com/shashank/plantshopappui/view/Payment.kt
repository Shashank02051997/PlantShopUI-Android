package com.shashank.plantshopappui.view

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.shashank.plantshopappui.R
import com.shashank.plantshopappui.component.TopBarWithBack
import com.shashank.plantshopappui.theme.*

class Payment : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PaymentView()
        }
    }
}

@Composable
fun PaymentView() {

    PlantShopAppUITheme {
        Scaffold(
            topBar = {
                TopBarWithBack(
                    title = stringResource(R.string.title_activity_payment),
                    onBackClick = {

                    },
                )
            }, backgroundColor = cottonBall,
            content = {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                ) {
                    Row(
                        verticalAlignment = Alignment.Top,
                        horizontalArrangement = Arrangement.Center,
                        modifier = Modifier
                            .fillMaxWidth()
                            .fillMaxHeight(0.5f)
                            .padding(16.dp)
                    ) {
                        Box(
                            contentAlignment = Alignment.Center,
                            modifier = Modifier
                                .weight(0.5f)
                                .fillMaxHeight()
                        ) {
                            Box(
                                modifier = Modifier
                                    .padding(horizontal = 12.dp)
                                    .clip(RoundedCornerShape(12.dp))
                            ) {
                                Image(
                                    contentScale = ContentScale.Crop,
                                    painter = painterResource(R.drawable.plant_store_5),
                                    contentDescription = "Plant Image",
                                )
                            }

                        }
                        Spacer(modifier = Modifier.width(24.dp))
                        Column(
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.Start,
                            modifier = Modifier
                                .weight(0.5f)
                                .fillMaxHeight()
                        ) {
                            Text(
                                text = "Montstera Philodendron",
                                fontWeight = FontWeight.Bold,
                                fontSize = 16.sp,
                                color = annapolosBlue,
                            )
                            Spacer(modifier = Modifier.height(16.dp))
                            Text(
                                text = "Also known as the Swiss Cheese plant, is a species of following plant native to tropical forests of southern Mexico, south to Panama. It has been introduced to many tropical areas, and has become a in Hawaii",
                                fontSize = 12.sp,
                                color = annapolosBlue,
                            )
                        }
                    }
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .fillMaxHeight()
                            .background(Color.Black)
                            .padding(16.dp)

                    ) {
                        Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
                            Text(
                                text = "Payment Method",
                                fontWeight = FontWeight.Bold,
                                fontSize = 16.sp,
                                color = white,
                            )
                            Spacer(modifier = Modifier.height(16.dp))
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                            ) {
                                Button(
                                    onClick = { /*TODO*/ },
                                    elevation = null,
                                    shape = RoundedCornerShape(8.dp),
                                    colors = ButtonDefaults.buttonColors(
                                        backgroundColor = white
                                    ),
                                    modifier = Modifier
                                        .weight(0.3f)
                                        .height(48.dp)
                                ) {
                                    Image(
                                        painter = painterResource(R.drawable.mastercard),
                                        modifier = Modifier.fillMaxWidth(0.6f),
                                        contentDescription = "Mastercard Image",
                                    )
                                }
                                Spacer(modifier = Modifier.width(8.dp))
                                Button(
                                    onClick = { /*TODO*/ },
                                    elevation = null,
                                    shape = RoundedCornerShape(8.dp),
                                    colors = ButtonDefaults.buttonColors(
                                        backgroundColor = white
                                    ),
                                    modifier = Modifier
                                        .weight(0.3f)
                                        .height(48.dp)
                                ) {
                                    Image(
                                        painter = painterResource(R.drawable.paypal),
                                        modifier = Modifier.fillMaxWidth(0.6f),
                                        contentDescription = "Paypal Image",
                                    )
                                }
                                Spacer(modifier = Modifier.width(8.dp))
                                Button(
                                    onClick = { /*TODO*/ },
                                    elevation = null,
                                    shape = RoundedCornerShape(8.dp),
                                    colors = ButtonDefaults.buttonColors(
                                        backgroundColor = white
                                    ),
                                    modifier = Modifier
                                        .weight(0.3f)
                                        .height(48.dp)
                                ) {
                                    Image(
                                        painter = painterResource(R.drawable.visa),
                                        modifier = Modifier.fillMaxWidth(0.6f),
                                        contentDescription = "Paypal Image",
                                    )
                                }
                                Spacer(modifier = Modifier.width(8.dp))
                                Button(
                                    onClick = { /*TODO*/ },
                                    elevation = null,
                                    shape = RoundedCornerShape(8.dp),
                                    colors = ButtonDefaults.buttonColors(
                                        backgroundColor = Color.DarkGray
                                    ),
                                    modifier = Modifier
                                        .weight(0.15f)
                                        .height(48.dp)
                                ) {
                                    Icon(
                                        imageVector = Icons.Default.Add,
                                        tint = Color.White,
                                        contentDescription = stringResource(R.string.text_add_icon),
                                        modifier = Modifier.size(20.dp, 20.dp),
                                    )
                                }
                            }
                            Spacer(modifier = Modifier.height(24.dp))
                            Row(
                                horizontalArrangement = Arrangement.SpaceBetween,
                                modifier = Modifier
                                    .fillMaxWidth()
                            ) {
                                Text(
                                    text = "Montstera Philodendron",
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 14.sp,
                                    color = white,
                                )
                                Text(
                                    text = "$ 75.00",
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 14.sp,
                                    color = white,
                                )
                            }
                            Spacer(modifier = Modifier.height(8.dp))
                            Divider(
                                color = Color.White,
                                thickness = 0.2.dp
                            )
                            Spacer(modifier = Modifier.height(20.dp))
                            Row(
                                horizontalArrangement = Arrangement.SpaceBetween,
                                modifier = Modifier
                                    .fillMaxWidth()
                            ) {
                                Text(
                                    text = "Packaging",
                                    fontSize = 14.sp,
                                    color = grey,
                                )
                                Text(
                                    text = "$ 15.00",
                                    fontSize = 14.sp,
                                    color = white,
                                )
                            }
                            Spacer(modifier = Modifier.height(8.dp))
                            Row(
                                horizontalArrangement = Arrangement.SpaceBetween,
                                modifier = Modifier
                                    .fillMaxWidth()
                            ) {
                                Text(
                                    text = "Tax",
                                    fontSize = 14.sp,
                                    color = grey,
                                )
                                Text(
                                    text = "$ 10.00",
                                    fontSize = 14.sp,
                                    color = white,
                                )
                            }
                            Spacer(modifier = Modifier.height(32.dp))
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.SpaceBetween,
                                modifier = Modifier
                                    .fillMaxWidth()
                            ) {

                                Column(
                                    modifier = Modifier
                                        .wrapContentHeight()
                                ) {
                                    Text(
                                        text = "Total",
                                        fontSize = 12.sp,
                                        color = grey,
                                    )
                                    Text(
                                        text = "$100.00",
                                        fontWeight = FontWeight.Bold,
                                        fontSize = 14.sp,
                                        color = cottonBall,
                                    )
                                }
                                Button(
                                    onClick = { /*TODO*/ },
                                    elevation = null,
                                    shape = RoundedCornerShape(16.dp),
                                    colors = ButtonDefaults.buttonColors(
                                        backgroundColor = green
                                    ),
                                ) {
                                    Text(
                                        text = "Confirm",
                                        color = white,
                                        fontSize = 12.sp
                                    )
                                }

                            }
                        }
                    }
                }
            })
    }
}