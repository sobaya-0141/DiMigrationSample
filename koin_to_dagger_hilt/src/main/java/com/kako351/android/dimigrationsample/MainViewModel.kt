package com.kako351.android.dimigrationsample

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kako351.android.dimigrationsample.repository.DaggerRepository
import com.kako351.android.dimigrationsample.repository.KoinRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import org.koin.core.KoinComponent
import org.koin.core.inject
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val daggerRepository: DaggerRepository,
    private val hiltTest: HiltTest
): ViewModel(), KoinComponent {
    private val koinRepository: KoinRepository by inject()
    private val koinTest: KoinTest by inject()

    val text = MutableLiveData(daggerRepository.text)

    init {
        koinTest.toString()
        hiltTest.toString()
    }
}
