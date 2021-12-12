package com.undertower.timeperiodcalculator.domain

import java.time.Period
import java.util.*

data class PeriodItemList(
    val id: Int,
    val startDate: Date,
    val endDate: Date,
    val period: Period
)
