package com.example.hearthstone.core.koin

import com.example.data.repository.CardsRepositoryImpl
import com.example.domain.core.CardsRepository
import org.koin.dsl.module

object DataModule {
    fun get() = module {
        single<CardsRepository> { CardsRepositoryImpl() }
    }
}