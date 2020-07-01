package com.example.hearthstone.cardlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hearthstone.R
import com.example.iddogs.core.BaseActivity

class CardListActivity : BaseActivity(), CardListView {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card_list)
    }
}