package com.example.data.network.remote.api


import com.example.domain.model.DaejeonSchoolEntity
import retrofit2.http.GET
import retrofit2.http.Query

interface DaeJeonShoolsInfoAPI {
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
    ): DaejeonSchoolEntity
}