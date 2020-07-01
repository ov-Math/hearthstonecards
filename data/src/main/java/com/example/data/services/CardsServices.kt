package com.example.data.services

import com.example.data.entity.Card
import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET
import retrofit2.http.Path

interface CardsServices {

    @GET("cards/classes/{class}")
    fun getCardsByClass(
        @Path("class") cardClass : String
    ) : Single<List<Card>>
}