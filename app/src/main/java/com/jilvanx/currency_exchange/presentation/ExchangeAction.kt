package com.jilvanx.currency_exchange.presentation

sealed interface ExchangeAction {
    data class Input(val value: String) : ExchangeAction
    data object Clear : ExchangeAction
    data object Delete : ExchangeAction
    data class SelectedFrom(val index: Int) : ExchangeAction
    data class SelectedTo(val index: Int) : ExchangeAction
}