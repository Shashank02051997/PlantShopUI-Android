package com.shashank.plantshopappui.view

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.shashank.plantshopappui.R
import com.shashank.plantshopappui.component.TopBarWithBack
import com.shashank.plantshopappui.theme.PlantShopAppUITheme
import com.shashank.plantshopappui.theme.annapolosBlue
import com.shashank.plantshopappui.theme.cottonBall

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
                        .padding(16.dp)
                ) {
                    Row(
                        verticalAlignment = Alignment.Top,
                        horizontalArrangement = Arrangement.Center,
                        modifier = Modifier
                            .fillMaxWidth()
                            .fillMaxHeight(0.5f)
                    ) {
                        Box(
                            contentAlignment = Alignment.Center,
                            modifier = Modifier
                                .weight(0.5f)
                                .fillMaxHeight()
                        ) {
                            Box(
                                modifier = Modifier
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
                                fontSize = 14.sp,
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
                }
            })
    }
}