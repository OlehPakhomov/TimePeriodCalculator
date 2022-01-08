package com.undertower.timeperiodcalculator.data

import android.annotation.SuppressLint
import com.undertower.timeperiodcalculator.domain.PeriodItemList
import com.undertower.timeperiodcalculator.domain.PeriodListRepository
import java.text.SimpleDateFormat
import java.time.LocalDate
import java.time.Period
import java.util.*

@SuppressLint("NewApi")
object PeriodListRepositoryImpl: PeriodListRepository {

    private val periodList = mutableListOf<PeriodItemList>()
    private var autoIncrementId = 0

    init {
        for (i in 0 until 10){
            val periodItemList = PeriodItemList(Date(), Date(), Period.ZERO)
            addPeriodListUseCase(periodItemList)
        }
    }

    override fun addPeriodListUseCase(periodItemList: PeriodItemList) {
        if(periodItemList.id == PeriodItemList.UNDIFINED_ID){
            periodItemList.id = autoIncrementId++
        }
        periodList.add(periodItemList)
    }

    override fun deletePeriodListUseCase(periodItemList: PeriodItemList) {
        periodList.remove(periodItemList)
    }

    override fun editPeriodListUseCase(periodItem: PeriodItemList) {
        val oldPeriodItemList = getPeriodItemUseCase(periodItem.id)
        deletePeriodListUseCase(oldPeriodItemList)
        addPeriodListUseCase(periodItem)
    }

    override fun getPeriodItemUseCase(periodItemId: Int): PeriodItemList {
        return periodList.find {
            it.id == periodItemId
        } ?: throw RuntimeException("Element with id $periodItemId not found!")
    }

    override fun getPeriodListUseCase(): List<PeriodItemList> {
        return periodList.toList()
    }
}