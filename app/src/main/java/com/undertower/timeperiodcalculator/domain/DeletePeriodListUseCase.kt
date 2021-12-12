package com.undertower.timeperiodcalculator.domain

class DeletePeriodListUseCase (private  val periodListRepository: PeriodListRepository) {
    fun deletePeriodListUseCase(periodItemList: PeriodItemList){
        periodListRepository.deletePeriodListUseCase(periodItemList)
    }
}