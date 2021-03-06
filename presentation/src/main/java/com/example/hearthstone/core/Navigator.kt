package com.example.hearthstone.core

import android.content.Intent
import com.example.hearthstone.cardlist.CardListActivity
import com.example.hearthstone.cardlist.CardListPresenter
import com.example.hearthstone.model.CardModel
import com.example.iddogs.core.BaseActivity

class Navigator (private val activity: BaseActivity) {

    fun navigateCardList(list : Array<CardModel>, activityTitle : String) {
        val intent = Intent(activity, CardListActivity::class.java)
        intent.putExtra(CardListPresenter.CARD_LIST, list)
        intent.putExtra(CardListPresenter.ACTIVITY_TITLE, activityTitle)
        activity.startActivity(intent)
    }
}