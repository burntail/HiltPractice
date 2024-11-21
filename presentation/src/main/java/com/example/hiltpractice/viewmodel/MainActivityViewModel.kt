package com.example.hiltpractice.viewmodel

import android.util.Log
import androidx.compose.runtime.MutableState
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.domain.model.DaejeonSchoolEntity
import com.example.domain.usecase.GetDaeJeonSchoolUseCases
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject


@HiltViewModel
class MainActivityViewModel @Inject constructor(private val daejeonSchoolUseCases: GetDaeJeonSchoolUseCases): ViewModel() {
    private val _age: MutableLiveData<Int> = MutableLiveData(0)
    val age: LiveData<Int> = _age

    private val _schoolsData:  MutableStateFlow<DaejeonSchoolEntity> = MutableStateFlow(DaejeonSchoolEntity())
    val shoolsData: StateFlow<DaejeonSchoolEntity> = _schoolsData.asStateFlow()


    fun upadateAge(newAge: Int) {
        _age.value = newAge
    }

    fun getDaeJeonSchoolInfos() {
        viewModelScope.launch(Dispatchers.IO) {
            daejeonSchoolUseCases.getDaeJeonSchoolsInfo().collectLatest {
                _schoolsData.value = it

                it.response?.body?.items?.forEach { item ->
                    Log.d("beom","$item")
                }
            }
        }
    }

}