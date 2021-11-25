package com.kako351.android.dimigrationsample.module

import com.kako351.android.dimigrationsample.repository.DaggerRepository
import com.kako351.android.dimigrationsample.repository.DaggerRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
abstract class RepositoryModule {
    @Binds
    @ViewModelScoped
    abstract fun bindDaggerRepository(impl: DaggerRepositoryImpl): DaggerRepository
}
