package com.kako351.android.dimigrationsample

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kako351.android.dimigrationsample.repository.DaggerRepository
import com.kako351.android.dimigrationsample.repository.KoinRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(val pository: DaggerRepository): ViewModel() {
    val text = MutableLiveData(pository.text)
}
