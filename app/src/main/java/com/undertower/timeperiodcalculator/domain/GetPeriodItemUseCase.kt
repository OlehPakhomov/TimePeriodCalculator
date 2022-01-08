package com.undertower.timeperiodcalculator.domain

class GetPeriodItemUseCase (private  val periodListRepository: PeriodListRepository){
    fun getPeriodItem(periodItemId:Int):PeriodItemList{
        return periodListRepository.getPeriodItemUseCase(periodItemId)
    }
}