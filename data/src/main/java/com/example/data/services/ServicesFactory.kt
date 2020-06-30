package com.example.data.services

import com.example.data.core.RequestManager

internal class ServicesFactory {

    companion object {
        //Singleton
        private var instance : ServicesFactory? = null

        @Synchronized
        fun instance() : ServicesFactory {
            if(instance == null){
                instance = ServicesFactory()
            }
            return instance!!
        }
    }

    val retrofit = RequestManager.provideRetrofit("https://omgvamp-hearthstone-v1.p.rapidapi.com/")

    // Singletons
    private var cardsServices: CardsServices? = null

    fun getCardsServices() : CardsServices {

        if(cardsServices == null) {
            cardsServices = retrofit.create(CardsServices::class.java)
        }
        return cardsServices!!
    }

}