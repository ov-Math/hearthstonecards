package com.example.domain.core

import com.example.domain.model.*
import io.reactivex.rxjava3.core.Single

interface CardsRepository {
    fun getClasses() : List<Classes>
    fun getRaces() : List<Races>
    fun getSets() : List<Sets>
    fun getTypes() : List<Types>
    fun getFactions() : List<Factions>
    fun getQualities() : List<Qualities>
    fun getCardsByClass(cardClass : Classes) : Single<List<CardDomain>>
}