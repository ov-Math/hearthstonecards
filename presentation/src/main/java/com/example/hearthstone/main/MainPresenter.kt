package com.example.hearthstone.main

import com.example.domain.interactors.*
import com.example.domain.model.CardDomain
import com.example.domain.model.Classes
import com.example.domain.model.Filter
import com.example.domain.model.Sets
import com.example.hearthstone.core.Navigator
import com.example.hearthstone.model.CardModel
import com.example.iddogs.core.BasePresenter

class MainPresenter (private val navigator: Navigator,
                     private val getClasses: GetClasses,
                     private val getRaces: GetRaces,
                     private val getTypes: GetTypes,
                     private val getSets: GetSets,
                     private val getQualities: GetQualities,
                     private val getFactions: GetFactions,
                     private val getCardsByClass: GetCardsByClass,
                     private val getCardsBySet: GetCardsBySet) : BasePresenter<MainView>() {

    var classesList = getClasses.execute()
    var racesList = getRaces.execute()
    var typesList = getTypes.execute()
    var setsList = getSets.execute()
    var qualitiesList = getQualities.execute()
    var factionList = getFactions.execute()

    fun getCardsByFilter(filter : Filter) {
        view?.showLoading()
        when(filter) {
            is Classes -> {
                getCardsByClass(filter)
            }
            is Sets -> {
                getCardsBySet(filter)
            }
        }
    }

    private fun getCardsByClass(cardClass : Classes) {
        getCardsByClass
            .with(cardClass)
            .execute()
            .subscribe({
                navigateCardLit(it, cardClass.text)
                view?.hideLoading()
            },{
                view?.hideLoading()
                view?.showGenericError()
            })
    }

    private fun getCardsBySet(set : Sets) {
        getCardsBySet
            .with(set)
            .execute()
            .subscribe({
                navigateCardLit(it, set.text)
                view?.hideLoading()
            },{
                view?.hideLoading()
                view?.showGenericError()
            })
    }

    private fun navigateCardLit(list : List<CardDomain>, filterText : String) {
        navigator.navigateCardList(getCardModelArrayFromCardDomainList(list), filterText)
    }

    private fun getCardModelArrayFromCardDomainList(list : List<CardDomain>) : Array<CardModel> {
        return list.map { CardModel.fromDomainObject(it) }.toTypedArray()
    }

}