package com.undertower.timeperiodcalculator.domain

class DeletePeriodListUseCase (private  val periodListRepository: PeriodListRepository) {
    fun deletePeriodList(periodItemList: PeriodItemList){
        periodListRepository.deletePeriodListUseCase(periodItemList)
    }
}