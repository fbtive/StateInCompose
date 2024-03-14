package com.example.stateincompose.viewmodel

import androidx.compose.runtime.toMutableStateList
import androidx.lifecycle.ViewModel
import com.example.stateincompose.getWellnessTasks
import com.example.stateincompose.model.WellnessTask

class WellnessViewModel: ViewModel() {

    private val _tasks = getWellnessTasks().toMutableStateList()
    val tasks: List<WellnessTask>
        get() = _tasks

    fun remove(item: WellnessTask) {
        _tasks.remove(item)
    }

    fun changeTaskChecked(item: WellnessTask, checked: Boolean) =
        _tasks.find { it.id == item.id }?.let { task -> task.checked = checked }
}