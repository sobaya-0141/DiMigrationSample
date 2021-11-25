package com.kako351.android.dimigrationsample

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class KoinViewModel: ViewModel() {
    val text = MutableLiveData("KoinViewModel")
}
