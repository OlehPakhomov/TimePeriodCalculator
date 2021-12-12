package com.undertower.timeperiodcalculator.domain

interface PeriodListRepository {

    fun addPeriodListUseCase(periodItemList: PeriodItemList)

    fun deletePeriodListUseCase(periodItemList: PeriodItemList)

    fun editPeriodListUseCase(periodItem: PeriodItemList)

    fun getPeriodItemUseCase(periodItemId:Int):PeriodItemList

    fun getPeriodListUseCase(): List<PeriodItemList>
}