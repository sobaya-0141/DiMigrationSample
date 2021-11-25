package com.kako351.android.dimigrationsample.repository

import android.content.Context
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

class DaggerRepositoryImpl @Inject constructor(@ApplicationContext context: Context) : DaggerRepository {

    override val text: String
        get() = "DaggerRepository"
}
