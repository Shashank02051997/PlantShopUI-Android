package com.shashank.plantshopappui.view

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
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
import com.shashank.plantshopappui.theme.*

class Store : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            StoreView()
        }
    }
}

@Composable
fun StoreView() {

    val plantStoreCardItemList =
        listOf(
            Pair("Florida Plant", "Florida USA"),
            Pair("Montsera Store", "New York, USA"),
            Pair("AI Plant Store", "Atlanta, USA"),
            Pair("C Plant Store", "Boston, USA")
        )
    val storePlantImagesList = listOf<Int>(
        R.drawable.plant_store_1,
        R.drawable.plant_store_2,
        R.drawable.plant_store_3,
        R.drawable.plant_store_4
    )

    PlantShopAppUITheme {
        Scaffold(
            topBar = {
                TopBarWithBack(
                    title = stringResource(R.string.title_activity_store),
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
                    LazyColumn(modifier = Modifier.fillMaxSize()) {
                        items(plantStoreCardItemList.size) { item ->
                            Spacer(modifier = Modifier.height(44.dp))
                            Box(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .wrapContentHeight()
                            ) {
                                Card(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .wrapContentHeight(),
                                    shape = RoundedCornerShape(16.dp)
                                ) {
                                    Row(
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .padding(16.dp)
                                    ) {
                                        Row(
                                            modifier = Modifier
                                                .fillMaxWidth()
                                                .weight(0.4f)
                                        ) {

                                        }
                                        Column(
                                            verticalArrangement = Arrangement.Top,
                                            horizontalAlignment = Alignment.Start,
                                            modifier = Modifier
                                                .fillMaxWidth()
                                                .weight(0.6f)
                                        ) {
                                            Text(
                                                text = plantStoreCardItemList[item].first,
                                                fontWeight = FontWeight.Bold,
                                                fontSize = 16.sp,
                                                color = annapolosBlue,
                                            )
                                            Text(
                                                text = plantStoreCardItemList[item].second,
                                                fontSize = 12.sp,
                                                color = veiledSpotlight,
                                            )
                                            Spacer(modifier = Modifier.height(4.dp))
                                            Text(
                                                text = stringResource(R.string.text_rating),
                                                fontSize = 12.sp,
                                                color = annapolosBlue,
                                            )
                                            Spacer(modifier = Modifier.height(16.dp))
                                            Row(
                                                modifier = Modifier
                                                    .fillMaxWidth(),
                                                verticalAlignment = Alignment.CenterVertically,
                                                horizontalArrangement = Arrangement.Center,

                                                ) {
                                                Box(
                                                    modifier = Modifier
                                                        .weight(0.5f)
                                                ) {
                                                    Row(
                                                        modifier = Modifier
                                                            .fillMaxWidth(),
                                                        verticalAlignment = Alignment.CenterVertically,
                                                        horizontalArrangement = Arrangement.Start,
                                                    ) {
                                                        Image(
                                                            modifier = Modifier
                                                                .clip(CircleShape)
                                                                .size(24.dp, 24.dp),
                                                            contentScale = ContentScale.Crop,
                                                            painter = painterResource(R.drawable.user_1),
                                                            contentDescription = stringResource(R.string.text_user_image),
                                                        )
                                                        Image(
                                                            modifier = Modifier
                                                                .offset((-8).dp, 0.dp)
                                                                .clip(CircleShape)
                                                                .size(24.dp, 24.dp),
                                                            contentScale = ContentScale.Crop,
                                                            painter = painterResource(R.drawable.user_2),
                                                            contentDescription = stringResource(R.string.text_user_image),
                                                        )
                                                        Image(
                                                            modifier = Modifier
                                                                .offset((-16).dp, 0.dp)
                                                                .clip(CircleShape)
                                                                .size(24.dp, 24.dp),
                                                            contentScale = ContentScale.Crop,
                                                            painter = painterResource(R.drawable.user_3),
                                                            contentDescription = stringResource(R.string.text_user_image),
                                                        )
                                                    }
                                                }
                                                Spacer(modifier = Modifier.width(8.dp))
                                                Button(
                                                    onClick = { /*TODO*/ },
                                                    elevation = null,
                                                    modifier = Modifier
                                                        .weight(0.5f),
                                                    shape = RoundedCornerShape(8.dp),
                                                    colors = ButtonDefaults.buttonColors(
                                                        backgroundColor = green
                                                    ),
                                                ) {
                                                    Text(
                                                        text = stringResource(R.string.text_visit),
                                                        color = white,
                                                        fontSize = 12.sp
                                                    )
                                                }
                                            }
                                        }
                                    }

                                }
                                Card(
                                    modifier = Modifier
                                        .offset(16.dp, (-44).dp)
                                        .fillMaxWidth(0.3f)
                                        .height(164.dp),
                                    shape = RoundedCornerShape(16.dp)
                                ) {
                                    Image(
                                        contentScale = ContentScale.Crop,
                                        painter = painterResource(storePlantImagesList[item]),
                                        contentDescription = stringResource(R.string.text_plant_image),
                                    )
                                }
                            }
                        }
                    }
                }
            })
    }
}