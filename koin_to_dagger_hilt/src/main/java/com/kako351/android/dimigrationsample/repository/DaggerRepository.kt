package com.kako351.android.dimigrationsample.repository

interface DaggerRepository {
    val text: String
    companion object {
        fun new() = DaggerRepository
    }
}
