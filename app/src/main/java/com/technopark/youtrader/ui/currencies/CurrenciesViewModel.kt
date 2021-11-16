package com.technopark.youtrader.ui.currencies

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.technopark.youtrader.base.BaseViewModel
import com.technopark.youtrader.model.Currency
import com.technopark.youtrader.model.CurrencyItem

class CurrenciesViewModel : BaseViewModel() {

    private val _currencyItems: MutableLiveData<List<CurrencyItem>> =
        MutableLiveData(getCurrencyItems())
    val currencyItems: LiveData<List<CurrencyItem>> = _currencyItems

    fun navigateToAuthFragment() {
        navigateTo(CurrenciesFragmentDirections.actionCurrenciesFragmentToAuthFragment())
    }

    fun navigateToChartFragment() {
        navigateTo(CurrenciesFragmentDirections.actionCurrenciesFragmentToChartFragment())
    }

    fun navigateToWithoutBottomNavViewFragment() {
        navigateTo(
            CurrenciesFragmentDirections.actionCurrenciesFragmentToWithoutBottomNavViewFragment()
        )
    }

    private fun getCurrencyItems(): List<CurrencyItem> {
        val currencyItems = mutableListOf<CurrencyItem>()
        for (currency in getCurrencies()) {
            currencyItems.add(CurrencyItem(currency))
        }
        return currencyItems
    }

    private fun getCurrencies(): List<Currency> {
        return listOf(
            Currency("BitCoin", "66k"),
            Currency("DogeCoin", "133k"),
            Currency("DogeCoin", "133k"),
            Currency("DogeasadassadasdasCoin", "133k"),
            Currency("DogeCasdasdasdoin", "133k"),
            Currency("DogeqweCoin", "14k"),
            Currency("DogeqweCoin", "63k"),
            Currency("DogwqeeCoin", "78k"),
            Currency("DogeqweCoin", "57k"),
            Currency("DogeCqweqwoin", "133k"),
            Currency("DogeqweCoin", "13k"),
            Currency("DogeCqweoin", "21k"),
            Currency("DogeCqweoin", "91k"),
        )
    }

    companion object {
        private const val TAG = "CurrenciesViewModel"
    }
}
