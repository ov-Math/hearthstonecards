package com.example.hearthstone.cardlist

import android.os.Bundle
import com.example.hearthstone.R
import com.example.iddogs.core.BaseActivity
import org.koin.android.ext.android.inject
import org.koin.core.parameter.parametersOf

class CardListActivity : BaseActivity(), CardListView {

    private val presenter : CardLsitPresenter by inject { parametersOf(this) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card_list)

        presenter.attachView(this)
    }
}