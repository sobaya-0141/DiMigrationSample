package com.kako351.android.dimigrationsample

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.core.context.startKoin
import org.koin.dsl.module

class MyApplication : Application(){
    private val appModule = module {
        viewModel { KoinViewModel() }
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
