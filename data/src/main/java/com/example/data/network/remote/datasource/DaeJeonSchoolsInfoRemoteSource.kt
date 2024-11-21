package com.example.data.network.remote.datasource

import com.example.data.network.remote.api.DaeJeonShoolsInfoAPI
import com.example.domain.model.DaejeonSchoolEntity
import javax.inject.Inject

internal class DaeJeonSchoolsInfoRemoteSource @Inject constructor(
    private val api: DaeJeonShoolsInfoAPI
) {
    suspend fun getDaeJeonSchoolsInfo(
        serviceKey: String,
        gu: String,
        pageNo: String,
        numOfRows: String
    ): DaejeonSchoolEntity = api.getShools(
        serviceKey = serviceKey,
        gu = gu,
        pageNo = pageNo,
        numOfRows = numOfRows
    )
}