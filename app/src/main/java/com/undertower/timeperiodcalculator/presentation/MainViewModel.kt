package com.undertower.timeperiodcalculator.presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.undertower.timeperiodcalculator.data.PeriodListRepositoryImpl
import com.undertower.timeperiodcalculator.domain.DeletePeriodListUseCase
import com.undertower.timeperiodcalculator.domain.GetPeriodListUseCase
import com.undertower.timeperiodcalculator.domain.PeriodItemList

class MainViewModel : ViewModel(){

    val repository = PeriodListRepositoryImpl

    private val getPeriodListUseCase = GetPeriodListUseCase(repository)
    private val deletePeriodListUseCase = DeletePeriodListUseCase(repository)

    val periodList = MutableLiveData<List<PeriodItemList>>()

    fun getPeriodList(){
        periodList.value = getPeriodListUseCase.getPeriodList()
    }

    fun deletePeriodListUseCase(periodItemList: PeriodItemList){
        deletePeriodListUseCase.deletePeriodList(periodItemList)
        getPeriodList()
    }
}