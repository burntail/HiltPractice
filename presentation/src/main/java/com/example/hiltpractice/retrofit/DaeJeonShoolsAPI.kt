package com.example.hiltpractice.retrofit

import android.util.Log
import com.example.hiltpractice.data.DaeJeonSchoolsResponseData
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface DaeJeonShoolsAPI {
    @GET("getmidHighSchInfo")
    fun getShools(
        @Query("serviceKey", encoded = true)
        serviceKey: String,
        @Query("gu")
        gu: String,
        @Query("pageNo")
        pageNo: String,
        @Query("numOfRows")
        numOfRows: String
    ): Call<DaeJeonSchoolsResponseData>
}