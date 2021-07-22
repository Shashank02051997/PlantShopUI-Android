package com.shashank.plantshopappui.component

import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.twotone.Menu
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.shashank.plantshopappui.R
import com.shashank.plantshopappui.theme.black
import com.shashank.plantshopappui.theme.eveningGlory

@Composable
fun TopBarWithBack(title: String, onBackClick: () -> Unit) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 16.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        IconButton(onClick = { onBackClick() }) {
            Icon(
                modifier = Modifier.size(32.dp, 32.dp),
                imageVector = Icons.Default.KeyboardArrowLeft,
                contentDescription = stringResource(R.string.text_back_icon),
                tint = black
            )
        }

        Text(
            text = title,
            color = eveningGlory,
            modifier = Modifier.padding(start = 16.dp),
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            fontSize = 16.sp,
        )

        IconButton(onClick = {  }) {
            Icon(
                imageVector = Icons.Default.MoreVert,
                contentDescription = stringResource(R.string.text_menu_icon),
                tint = black
            )
        }

    }

}