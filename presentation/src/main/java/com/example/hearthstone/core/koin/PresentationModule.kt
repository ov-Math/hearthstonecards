package com.example.hearthstone.core.koin

import com.example.hearthstone.cardlist.CardListPresenter
import com.example.hearthstone.core.Navigator
import com.example.hearthstone.main.MainPresenter
import com.example.iddogs.core.BaseActivity
import org.koin.dsl.module

object PresentationModule {
    fun get() = module {
        factory { (activity: BaseActivity) -> MainPresenter(Navigator((activity)), get(), get(), get(), get(), get(), get(), get(), get(), get(), get(), get(), get()) }
        factory { (activity: BaseActivity) -> CardListPresenter(Navigator(activity)) }
    }
}