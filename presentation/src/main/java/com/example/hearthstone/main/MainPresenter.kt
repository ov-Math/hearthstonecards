package com.example.hearthstone.main

import com.example.domain.interactors.*
import com.example.hearthstone.core.Navigator
import com.example.iddogs.core.BasePresenter

class MainPresenter (private val navigator: Navigator,
                     private val getClasses: GetClasses,
                     private val getRaces: GetRaces,
                     private val getTypes: GetTypes,
                     private val getSets: GetSets,
                     private val getQualities: GetQualities,
                     private val getFactions: GetFactions) : BasePresenter<MainView>() {

    var classesList = getClasses.execute()
    var racesList = getRaces.execute()
    var typesList = getTypes.execute()
    var setsList = getSets.execute()
    var qualitiesList = getQualities.execute()
    var factionList = getFactions.execute()

}