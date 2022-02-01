package com.kako351.android.dimigrationsample

import android.app.Application
import com.kako351.android.dimigrationsample.repository.DaggerRepository
import com.kako351.android.dimigrationsample.repository.DaggerRepositoryImpl
import com.kako351.android.dimigrationsample.repository.KoinRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.HiltAndroidApp
import dagger.hilt.components.SingletonComponent
import javax.inject.Inject
import javax.inject.Singleton
import org.koin.android.ext.koin.androidContext
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.core.KoinComponent
import org.koin.core.context.startKoin
import org.koin.core.inject
import org.koin.dsl.module

@HiltAndroidApp
class MyApplication : Application(){
    private val appModule = module {
        single { KoinRepository() }
        single { DaggerRepositoryImpl(get()) }
        single { KoinTest() }
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

class KoinTest

class HiltTestTwo @Inject constructor()

@Singleton
class HiltTest @Inject constructor(private val hiltTestTwo: HiltTestTwo) : KoinComponent {
    private val test: KoinTest by inject()

    init {
        test.toString()
        hiltTestTwo.toString()
    }
}
