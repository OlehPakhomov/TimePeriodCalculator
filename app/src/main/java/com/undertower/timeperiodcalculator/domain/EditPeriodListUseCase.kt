package com.undertower.timeperiodcalculator.domain

class EditPeriodListUseCase (private  val periodListRepository: PeriodListRepository){
    fun editPeriodListUseCase(periodItem: PeriodItemList){
        periodListRepository.editPeriodListUseCase(periodItem)
    }
}