package com.undertower.timeperiodcalculator.domain

class AddPeriodListUseCase (private  val periodListRepository: PeriodListRepository){
    fun addPeriodList(periodItemList: PeriodItemList){
        periodListRepository.addPeriodListUseCase(periodItemList)
    }
}