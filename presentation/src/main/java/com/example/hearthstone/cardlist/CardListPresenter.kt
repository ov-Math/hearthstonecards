package com.example.hearthstone.cardlist

import com.example.hearthstone.core.Navigator
import com.example.hearthstone.model.CardModel
import com.example.iddogs.core.BasePresenter

class CardListPresenter(private val navigator: Navigator) : BasePresenter<CardListView>() {

    companion object {
        const val CARD_LIST = "CARD_LIST"
        const val ACTIVITY_TITLE = "ACTIVITY_TITLE"
        const val DEFAULT_CARD_IMG = "https://wow.zamimg.com/images/hearthstone/backs/original/Card_Back_Default.png"
    }

    lateinit var cardList : List<CardModel>
}