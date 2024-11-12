package com.jilvanx.currency_exchange.presentation

import com.jilvanx.currency_exchange.domain.Currency

data class ExchangeState(
    val from: Currency = Currency("Euro", "EUR"),
    val to: Currency = Currency("Brazilian Real", "BRL"),
    val amount: String = "1",
    val result: String = "",
    val allCurrencies: List<Currency> = emptyList()
)
