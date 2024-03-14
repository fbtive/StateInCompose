package com.example.stateincompose

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.toMutableStateList
import androidx.compose.ui.Modifier


@Composable
fun WellnessScreen(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        StatefulCounter()

        var list = remember { getWellnessTasks().toMutableStateList() }
        WellnessTaskList(list = list, onCloseTask = { task -> list.remove(task) })
    }
}