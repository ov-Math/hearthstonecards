package com.example.hearthstone.core.koin

import com.example.domain.interactors.*
import org.koin.dsl.module

object DomainModule {
    fun get() = module {
        single { GetClasses(get()) }
        single { GetRaces(get()) }
        single { GetFactions(get()) }
        single { GetQualities(get()) }
        single { GetSets(get()) }
        single { GetTypes(get()) }
    }
}