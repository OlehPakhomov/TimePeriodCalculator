package com.undertower.timeperiodcalculator.domain

class EditPeriodListUseCase (private  val periodListRepository: PeriodListRepository){
    fun editPeriodList(periodItem: PeriodItemList){
        periodListRepository.editPeriodListUseCase(periodItem)
    }
}
