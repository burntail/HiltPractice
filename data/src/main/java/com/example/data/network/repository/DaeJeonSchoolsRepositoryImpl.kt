package com.example.data.network.repository

import com.example.data.network.apikey.ApiKeys
import com.example.data.network.remote.api.DaeJeonShoolsInfoAPI
import com.example.data.network.remote.datasource.DaeJeonSchoolsInfoRemoteSource
import com.example.domain.model.DaejeonSchoolEntity
import com.example.domain.repository.DaeJeonShoolsRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

internal class DaeJeonSchoolsRepositoryImpl @Inject constructor (
    val remoteSource: DaeJeonSchoolsInfoRemoteSource
): DaeJeonShoolsRepository  {
    override suspend fun getDaeJeonSchoolsInfo(): Flow<DaejeonSchoolEntity> = flow {
        emit(remoteSource.getDaeJeonSchoolsInfo(
             ApiKeys.daejeonSchoolsApiKey,
            "A",
            "1",
            "10"
        ))
    }
}