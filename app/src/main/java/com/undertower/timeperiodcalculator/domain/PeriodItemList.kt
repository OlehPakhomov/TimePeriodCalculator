package com.undertower.timeperiodcalculator.domain

import java.time.Period
import java.util.*

data class PeriodItemList(
    val startDate: Date,
    val endDate: Date,
    val period: Period,
    var id: Int = UNDIFINED_ID
){
    companion object{
        const val UNDIFINED_ID = -1
    }
}
