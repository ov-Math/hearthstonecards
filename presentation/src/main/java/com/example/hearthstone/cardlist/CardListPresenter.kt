package com.example.hearthstone.cardlist

import com.example.hearthstone.core.Navigator
import com.example.iddogs.core.BasePresenter

class CardListPresenter(private val navigator: Navigator) : BasePresenter<CardListView>() {

    companion object {
        const val CARD_LIST = "CARD_LIST"
    }
}