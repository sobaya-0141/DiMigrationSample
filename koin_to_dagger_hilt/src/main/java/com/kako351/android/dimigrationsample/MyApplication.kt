package com.kako351.android.dimigrationsample

import android.app.Application
import com.kako351.android.dimigrationsample.repository.DaggerRepository
import com.kako351.android.dimigrationsample.repository.DaggerRepositoryImpl
import com.kako351.android.dimigrationsample.repository.KoinRepository
import dagger.hilt.android.HiltAndroidApp
import org.koin.android.ext.koin.androidContext
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.core.context.startKoin
import org.koin.dsl.module

@HiltAndroidApp
class MyApplication : Application(){
    private val appModule = module {
        single { KoinRepository() }
        single { DaggerRepositoryImpl(get()) }
        viewModel { MainViewModel(get()) }
    }

    override fun onCreate() {
        super.onCreate()
        // Start Koin
        startKoin{
            androidContext(this@MyApplication)
            modules(listOf(appModule))
        }
    }
}
