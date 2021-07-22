package com.shashank.plantshopappui.component

import androidx.compose.foundation.layout.size
import androidx.compose.material.BottomAppBar
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
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
            imageVector = Icons.Default.Home,
            tint = annapolosBlue,
            contentDescription = stringResource(R.string.text_icon_home),
            modifier = Modifier
                .weight(1f)
                .size(24.dp, 24.dp)
        )
        Icon(
            imageVector = Icons.Default.Favorite,
            tint = lightSilver,
            contentDescription = stringResource(R.string.text_icon_home),
            modifier = Modifier
                .weight(1f)
                .size(24.dp, 24.dp)
        )
        Icon(
            imageVector = Icons.Default.ShoppingCart,
            tint = green,
            contentDescription = stringResource(R.string.text_icon_home),
            modifier = Modifier
                .weight(1f)
                .size(24.dp, 24.dp)
        )
        Icon(
            imageVector = Icons.Default.Settings,
            tint = lightSilver,
            contentDescription = stringResource(R.string.text_icon_home),
            modifier = Modifier
                .weight(1f)
                .size(24.dp, 24.dp)
        )
        Icon(
            imageVector = Icons.Default.Person,
            tint = lightSilver,
            contentDescription = stringResource(R.string.text_icon_home),
            modifier = Modifier
                .weight(1f)
                .size(24.dp, 24.dp)
        )

    }

}