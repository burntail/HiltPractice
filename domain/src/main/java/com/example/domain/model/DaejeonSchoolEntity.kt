package com.example.domain.model

data class DaejeonSchoolEntity (
    val response: Response? = Response()
)

data class Response (
    val header: Header? = Header(),
    val body: Body? = Body(),
)

data class Header (
    /**
     * 결과메세지
     * */
    val resultCode: String? = "",
    /**
     * 결과코드
     * */
    val resultMsg: String? = ""
)
data class Body (
    /**
     * 데이터 총 갯수
     * */
    val totalCount: String? = "",
    val items: List<DaeJeonSchoolData> = emptyList(),
)
data class DaeJeonSchoolData (
    val signgu: String? = "",

    val fondSe: String? = "",

    val schulNm: String? = "",

    val locplc: String? = "" ,

    val clasCo: String? = "",

    val stdntCo: String? = "",

    val csttCo: String? = "",

    val nclasCo: String? = "",

    val sclasCo: String? = "",

    val astdntCo: String? = "",

    val bstdntCo: String? = "",

    val cstdntCo: String? = "",

    val acsttCo: String? = "",

    val bcsttCo: String? = "",

    val ccsttCo: String? = "",

    val aclasCo: String? = "",

    val bclasCo: String? = "",

    val cclasCo: String? = "",
)
