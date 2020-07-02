package com.example.domain.interactors

import com.example.domain.core.CardsRepository
import com.example.domain.core.InvalidFilterException
import com.example.domain.model.CardDomain
import com.example.domain.model.Classes
import com.example.domain.model.Factions
import com.example.domain.model.Sets
import io.reactivex.rxjava3.core.Single

class GetCardsByFaction (val repository: CardsRepository) {

    private var faction : Factions? = null

    fun with(faction : Factions) : GetCardsByFaction {
        this.faction = faction
        return this
    }

    @Throws(InvalidFilterException::class)
    fun execute() : Single<List<CardDomain>> {
        if(this.faction == null) {
            throw InvalidFilterException("Filter cannot be null")
        }

        return repository.getCardsByFaction(faction!!)
    }
}