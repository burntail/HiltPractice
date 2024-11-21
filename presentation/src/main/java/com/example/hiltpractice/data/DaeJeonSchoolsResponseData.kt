package com.example.hiltpractice.data

import com.google.gson.annotations.SerializedName

data class DaeJeonSchoolsResponseData (
    @SerializedName("response")
    val response: Response?
)

data class Response (
    @SerializedName("header")
    val header: Header?,
    @SerializedName("body")
    val body: Body?,
)

data class Header (
    /**
     * 결과메세지
     * */
    @SerializedName("resultCode")
    val resultCode: String?,
    /**
     * 결과코드
     * */
    @SerializedName("resultMsg")
    val resultMsg: String?
)
data class Body (
    /**
     * 데이터 총 갯수
     * */
    @SerializedName("totalCount")
    val totalCount: String?,
    @SerializedName("items")
    val items: List<DaeJeonSchoolData>,
)
data class DaeJeonSchoolData (
    @SerializedName("signgu")
    val signgu: String?,
    @SerializedName("fondSe")
    val fondSe: String?,
    @SerializedName("schulNm")
    val schulNm: String?,
    @SerializedName("locplc")
    val locplc: String? ,
    @SerializedName("clasCo")
    val clasCo: String?,
    @SerializedName("stdntCo")
    val stdntCo: String?,
    @SerializedName("csttCo")
    val csttCo: String?,
    @SerializedName("nclasCo")
    val nclasCo: String?,
    @SerializedName("sclasCo")
    val sclasCo: String?,
    @SerializedName("astdntCo")
    val astdntCo: String?,
    @SerializedName("bstdntCo")
    val bstdntCo: String?,
    @SerializedName("cstdntCo")
    val cstdntCo: String?,
    @SerializedName("acsttCo")
    val acsttCo: String?,
    @SerializedName("bcsttCo")
    val bcsttCo: String?,
    @SerializedName("ccsttCo")
    val ccsttCo: String?,
    @SerializedName("aclasCo")
    val aclasCo: String?,
    @SerializedName("bclasCo")
    val bclasCo: String?,
    @SerializedName("cclasCo")
    val cclasCo: String?,
)
