package com.example.domain.repository


import com.example.domain.model.DaejeonSchoolEntity
import kotlinx.coroutines.flow.Flow

interface DaeJeonShoolsRepository {
    suspend fun getDaeJeonSchoolsInfo(): Flow<DaejeonSchoolEntity>
}