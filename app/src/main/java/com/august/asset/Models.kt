package com.august.asset

import java.math.BigDecimal
import java.util.Date

// 예금
data class SavingProduct(
    val name: String,
    val amount: BigDecimal,
    val startDate: Date,
    val endDate: Date,
    val interestRate: InterestRate,
    val savingType: SavingType,
)

data class InterestRate(
    val rate: Double,
    val rateType: RateType,
    val interestTaxRate: Double,
)

enum class RateType {
    DAILY, WEEKLY, MONTHLY_1, MONTHLY_3, MONTHLY_6, ANNUAL
}

enum class SavingType {
    DAILY_DEPOSIT, WEEKLY_DEPOSIT, MONTHLY_DEPOSIT, ANNUAL_DEPOSIT, BOND
}

// 차트 관련
data class ChartData(
    val xAxisName: String,
    val yAxisName: String,
    val amount: BigDecimal,
    val date: Date,
)