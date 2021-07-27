package com.shashank.plantshopappui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.BottomAppBar
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.shashank.plantshopappui.R
import com.shashank.plantshopappui.theme.annapolosBlue
import com.shashank.plantshopappui.theme.cottonBall
import com.shashank.plantshopappui.theme.green
import com.shashank.plantshopappui.theme.lightSilver

@Composable
fun BottomBar() {
    BottomAppBar(
        backgroundColor = cottonBall,
        elevation = 0.dp
    ) {
        Icon(
            painter = painterResource(R.drawable.home),
            tint = annapolosBlue,
            contentDescription = stringResource(R.string.text_icon_home),
            modifier = Modifier
                .weight(1f)
                .size(20.dp, 20.dp)
        )
        Icon(
            painter = painterResource(R.drawable.heart),
            tint = lightSilver,
            contentDescription = stringResource(R.string.text_icon_favorite),
            modifier = Modifier
                .weight(1f)
                .size(20.dp, 20.dp)
        )
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .weight(1f)
        ) {
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .clip(CircleShape)
                    .background(Color.White)
                    .size(44.dp, 44.dp)


            ) {
                Icon(
                    painter = painterResource(R.drawable.shopping_cart),
                    tint = green,
                    contentDescription = stringResource(R.string.text_icon_shopping_cart),
                    modifier = Modifier
                        .size(20.dp, 20.dp)
                )
            }

        }

        Icon(
            painter = painterResource(R.drawable.settings),
            tint = lightSilver,
            contentDescription = stringResource(R.string.text_icon_settings),
            modifier = Modifier
                .weight(1f)
                .size(20.dp, 20.dp)
        )
        Icon(
            painter = painterResource(R.drawable.user),
            tint = lightSilver,
            contentDescription = stringResource(R.string.text_icon_person),
            modifier = Modifier
                .weight(1f)
                .size(20.dp, 20.dp)
        )

    }

}