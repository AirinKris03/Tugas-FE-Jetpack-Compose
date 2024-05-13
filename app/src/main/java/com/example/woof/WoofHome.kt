package com.example.woof

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.unit.dp
import com.example.woof.data.DataProvider
import com.example.woof.data.Knine

@Composable
fun WoofHomeContent(navigateToProfile: (Knine) -> Unit) {
    val knines = remember { DataProvider.knineList}
    LazyColumn (
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)
    ) {
        items(
            items = knines,
            itemContent = {
                KnineListItem(knine = it,navigateToProfile)
            }
        )
    }
}