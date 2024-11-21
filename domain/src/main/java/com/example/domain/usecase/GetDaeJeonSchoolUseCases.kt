package com.example.domain.usecase

import com.example.domain.model.DaejeonSchoolEntity
import com.example.domain.repository.DaeJeonShoolsRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetDaeJeonSchoolUseCases @Inject constructor (
    private val repository: DaeJeonShoolsRepository
) {
    suspend fun getDaeJeonSchoolsInfo(): Flow<DaejeonSchoolEntity> = repository.getDaeJeonSchoolsInfo()
}