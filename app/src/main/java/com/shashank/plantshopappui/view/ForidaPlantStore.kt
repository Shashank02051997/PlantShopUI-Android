package com.shashank.plantshopappui.view

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.shashank.plantshopappui.R
import com.shashank.plantshopappui.component.BottomBar
import com.shashank.plantshopappui.component.TopBarWithBack
import com.shashank.plantshopappui.theme.*

class ForidaPlantStore : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ForidaPlantStoreView()
        }
    }
}

@Composable
@Preview
fun ForidaPlantStoreView() {

    var text by remember { mutableStateOf("") }
    val itemList = listOf("All", "Outdoor", "Indoor", "Office", "Garden")
    val indoorCardItemList = listOf("Montstera", "Philodendhron")
    val popularCardItemList = listOf("Red Aglonema", "Cactus")
    val indoorPlantImagesList = listOf<Int>(
        R.drawable.plant_store_5,
        R.drawable.plant_store_8,
    )
    val popularPlantImagesList = listOf(
        R.drawable.plant_store_7,
        R.drawable.plant_store_6,
    )

    PlantShopAppUITheme {
        Scaffold(topBar = {
            TopBarWithBack(
                title = stringResource(R.string.title_activity_forida_plant_store),
                onBackClick = { },
            )
        }, bottomBar = { BottomBar() },
            backgroundColor = cottonBall,
            content = {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp)
                        .verticalScroll(rememberScrollState())
                ) {
                    Spacer(modifier = Modifier.height(28.dp))

                    Text(
                        text = stringResource(R.string.text_plant_catalog),
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp,
                        color = annapolosBlue,
                    )
                    Spacer(modifier = Modifier.height(16.dp))

                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Start,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(48.dp)
                    ) {
                        TextField(
                            modifier = Modifier
                                .weight(0.85f),
                            colors = TextFieldDefaults.textFieldColors(
                                backgroundColor = white,
                                focusedIndicatorColor = Color.Transparent,
                                unfocusedIndicatorColor = Color.Transparent,
                            ),
                            value = text,
                            shape = RoundedCornerShape(12.dp),
                            singleLine = true,
                            onValueChange = { text = it },
                            placeholder = {
                                Text(
                                    text = stringResource(R.string.text_search),
                                    color = veiledSpotlight
                                )
                            },
                            leadingIcon = {
                                Icon(
                                    imageVector = Icons.Filled.Search,
                                    contentDescription = stringResource(R.string.text_search_icon),
                                    tint = anon
                                )
                            },
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        Button(
                            onClick = { /*TODO*/ },
                            elevation = null,
                            modifier = Modifier
                                .weight(0.15f),
                            contentPadding = PaddingValues(top = 16.dp, bottom = 16.dp),
                            shape = RoundedCornerShape(12.dp),
                            colors = ButtonDefaults.buttonColors(
                                backgroundColor = green
                            ),
                        ) {
                            Icon(
                                painter = painterResource(R.drawable.filter),
                                contentDescription = stringResource(R.string.text_filter_icon),
                                tint = white,
                                modifier = Modifier.size(20.dp, 20.dp)
                            )
                        }
                    }
                    Spacer(modifier = Modifier.height(24.dp))

                    LazyRow(modifier = Modifier.fillMaxWidth()) {
                        items(itemList.size) { item ->
                            Box(
                                modifier = Modifier
                                    .clip(RoundedCornerShape(8.dp))
                                    .background(if (item == 2) Color.White else Color.Transparent)
                            ) {
                                Text(
                                    modifier = Modifier
                                        .padding(
                                            start = 8.dp,
                                            end = 8.dp,
                                            top = 4.dp,
                                            bottom = 4.dp
                                        ),
                                    text = itemList[item],
                                    color = eveningGlory
                                )
                            }
                            Spacer(modifier = Modifier.width(16.dp))
                        }
                    }
                    Spacer(modifier = Modifier.height(24.dp))

                    LazyRow(modifier = Modifier.fillMaxWidth()) {
                        items(indoorCardItemList.size) { item ->
                            Card(
                                modifier = Modifier
                                    .width(180.dp)
                                    .wrapContentHeight(),
                                shape = RoundedCornerShape(16.dp)
                            ) {
                                Column(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .wrapContentHeight()
                                        .padding(12.dp)
                                ) {
                                    Box(
                                        modifier = Modifier
                                            .wrapContentSize()
                                            .clip(RoundedCornerShape(12.dp))
                                    ) {
                                        Image(
                                            modifier = Modifier.height(180.dp),
                                            contentScale = ContentScale.Crop,
                                            painter = painterResource(indoorPlantImagesList[item]),
                                            contentDescription = stringResource(R.string.text_indoor_plant_image),
                                        )
                                    }
                                    Spacer(modifier = Modifier.height(16.dp))
                                    Text(
                                        text = stringResource(R.string.text_indoor),
                                        fontSize = 12.sp,
                                        color = annapolosBlue,
                                    )
                                    Text(
                                        text = indoorCardItemList[item],
                                        fontWeight = FontWeight.Bold,
                                        fontSize = 16.sp,
                                        color = annapolosBlue,
                                    )
                                    Spacer(modifier = Modifier.height(4.dp))
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
                                                text = stringResource(R.string.text_from),
                                                fontSize = 12.sp,
                                                color = annapolosBlue,
                                            )
                                            Text(
                                                text = stringResource(R.string.text_amount_75),
                                                fontWeight = FontWeight.Bold,
                                                fontSize = 14.sp,
                                                color = annapolosBlue,
                                            )
                                        }
                                        Box(
                                            modifier = Modifier
                                                .clip(CircleShape)
                                                .background(green)
                                                .padding(4.dp),
                                            contentAlignment = Alignment.Center
                                        ) {
                                            Icon(
                                                modifier = Modifier.size(20.dp, 20.dp),
                                                imageVector = Icons.Default.Add,
                                                contentDescription = stringResource(R.string.text_add_icon),
                                                tint = white
                                            )
                                        }

                                    }

                                }
                            }
                            Spacer(modifier = Modifier.width(16.dp))
                        }
                    }
                    Spacer(modifier = Modifier.height(28.dp))

                    Text(
                        text = stringResource(R.string.text_popular),
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp,
                        color = annapolosBlue,
                    )
                    Spacer(modifier = Modifier.height(24.dp))

                    LazyRow(modifier = Modifier.fillMaxWidth()) {
                        items(popularCardItemList.size) { item ->
                            Card(
                                modifier = Modifier
                                    .width(210.dp)
                                    .wrapContentHeight(),
                                shape = RoundedCornerShape(16.dp)
                            ) {
                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .wrapContentHeight()
                                        .padding(12.dp)
                                ) {
                                    Box(
                                        modifier = Modifier
                                            .weight(0.3f)
                                            .height(64.dp)
                                            .clip(RoundedCornerShape(12.dp)),
                                    ) {
                                        Image(
                                            contentScale = ContentScale.Crop,
                                            painter = painterResource(popularPlantImagesList[item]),
                                            contentDescription = stringResource(R.string.text_popular_plant_image),
                                        )
                                    }

                                    Spacer(modifier = Modifier.width(16.dp))
                                    Column(
                                        verticalArrangement = Arrangement.SpaceEvenly,
                                        horizontalAlignment = Alignment.Start,
                                        modifier = Modifier
                                            .weight(0.7f)
                                            .wrapContentHeight()
                                    ) {
                                        Text(
                                            text = stringResource(R.string.text_indoor),
                                            fontSize = 12.sp,
                                            color = annapolosBlue,
                                        )
                                        Text(
                                            text = popularCardItemList[item],
                                            fontWeight = FontWeight.Bold,
                                            fontSize = 14.sp,
                                            color = annapolosBlue,
                                        )
                                        Spacer(modifier = Modifier.height(16.dp))
                                        Text(
                                            text = stringResource(R.string.text_amount_75),
                                            fontWeight = FontWeight.Bold,
                                            fontSize = 12.sp,
                                            color = annapolosBlue,
                                        )
                                    }
                                }
                            }
                            Spacer(modifier = Modifier.width(16.dp))

                        }
                    }
                    Spacer(modifier = Modifier.height(104.dp))
                }
            })
    }

}