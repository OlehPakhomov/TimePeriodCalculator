package com.undertower.timeperiodcalculator.domain

class GetPeriodListUseCase (private  val periodListRepository: PeriodListRepository){
    fun getPeriodListUseCase(): List<PeriodItemList>{
        return periodListRepository.getPeriodListUseCase()
    }
}