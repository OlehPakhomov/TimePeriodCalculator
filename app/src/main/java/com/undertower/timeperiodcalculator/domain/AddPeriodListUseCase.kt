package com.undertower.timeperiodcalculator.domain

class AddPeriodListUseCase (private  val periodListRepository: PeriodListRepository){
    fun addPeriodListUseCase(periodItemList: PeriodItemList){
        periodListRepository.addPeriodListUseCase(periodItemList)
    }
}