package com.example.data.network.remote.di

import com.squareup.moshi.Moshi
import dagger.Provides
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Qualifier
import javax.inject.Singleton


@Qualifier
@MustBeDocumented
@Retention(AnnotationRetention.RUNTIME)
annotation class DaeJeonSchoolsInfoRetrofit

object ServerModule {

    const val DAEJEON_SCHOOLS_INFO_URL = "https://apis.data.go.kr/6300000/openapi2022/midHighSchInfo/"

    /**
     * MIMS Retrofit
     */
    @DaeJeonSchoolsInfoRetrofit
    @Provides
    @Singleton
    fun provideDaeJeonSchoolsInfoRetrofit(): Retrofit {
        val logging = HttpLoggingInterceptor()
        logging.setLevel(HttpLoggingInterceptor.Level.BODY)

        val moshi = Moshi.Builder().build()
        val client = OkHttpClient.Builder()
            .addInterceptor(logging)
            .build()

        return Retrofit.Builder()
            .baseUrl(DAEJEON_SCHOOLS_INFO_URL) // 서버의 기본 URL
            .addConverterFactory(MoshiConverterFactory.create(moshi))
            .client(client)
            .build()
    }
}