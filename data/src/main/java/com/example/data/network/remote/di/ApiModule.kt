package com.example.data.network.remote.di

import com.example.data.network.remote.api.DaeJeonShoolsInfoAPI
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
internal object ApiModule {

    @Provides
    @Singleton
    fun provideDaeJeonSchoolsInfoApi(
        @DaeJeonSchoolsInfoRetrofit retrofit: Retrofit
    ): DaeJeonShoolsInfoAPI {
        return retrofit.create(DaeJeonShoolsInfoAPI::class.java)
    }
}