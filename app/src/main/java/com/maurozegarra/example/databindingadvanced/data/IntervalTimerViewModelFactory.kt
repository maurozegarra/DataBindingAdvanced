package com.maurozegarra.example.databindingadvanced.data

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.maurozegarra.example.databindingadvanced.util.DefaultTimer

/**
 * Factory for ViewModels
 */
object IntervalTimerViewModelFactory : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(IntervalTimerViewModel::class.java)) {
            return IntervalTimerViewModel(DefaultTimer) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
