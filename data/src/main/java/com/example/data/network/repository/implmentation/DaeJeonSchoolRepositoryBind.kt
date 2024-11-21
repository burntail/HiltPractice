package com.example.data.network.repository.implmentation

import com.example.data.network.repository.DaeJeonSchoolsRepositoryImpl
import com.example.domain.repository.DaeJeonShoolsRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract internal class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindDaeJeonSchoolsRepository(impl: DaeJeonSchoolsRepositoryImpl): DaeJeonShoolsRepository
}