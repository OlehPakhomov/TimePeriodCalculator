package com.undertower.timeperiodcalculator.domain

class GetPeriodListUseCase (private  val periodListRepository: PeriodListRepository){
    fun getPeriodList(): List<PeriodItemList>{
        return periodListRepository.getPeriodListUseCase()
    }
}