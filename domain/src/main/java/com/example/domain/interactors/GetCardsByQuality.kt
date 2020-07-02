package com.example.domain.interactors

import com.example.domain.core.CardsRepository
import com.example.domain.core.InvalidFilterException
import com.example.domain.model.CardDomain
import com.example.domain.model.Classes
import com.example.domain.model.Qualities
import com.example.domain.model.Sets
import io.reactivex.rxjava3.core.Single

class GetCardsByQuality (val repository: CardsRepository) {

    private var quality : Qualities? = null

    fun with(quality : Qualities) : GetCardsByQuality {
        this.quality = quality
        return this
    }

    @Throws(InvalidFilterException::class)
    fun execute() : Single<List<CardDomain>> {
        if(this.quality == null) {
            throw InvalidFilterException("Filter cannot be null")
        }

        return repository.getCardsByQuality(quality!!)
    }
}