package com.example.data.repository

import com.example.domain.core.CardsRepository
import com.example.domain.model.*

class CardsRepositoryImpl : CardsRepository {

    override fun getClasses(): List<Classes> {
        return mutableListOf(Classes.DRUID, Classes.HUNTER, Classes.MAGE, Classes.PALADIN, Classes.ROGUE, Classes.SHAMAN, Classes.WARLOCK, Classes.WARRIOR, Classes.DREAM)
    }

    override fun getRaces(): List<Races> {
        return mutableListOf(Races.DEMON, Races.DRAGON, Races.MECH, Races.MURLOC, Races.BEAST, Races.PIRATE, Races.TOTEM)
    }

    override fun getSets(): List<Sets> {
        return mutableListOf(Sets.BASIC, Sets.CLASSIC, Sets.CREDITS, Sets.NAXXRAMAS, Sets.DEBUG, Sets.GOBLINS_GNOMES, Sets.MISSIONS, Sets.PROMOTION, Sets.REWARD, Sets.SYSTEM, Sets.BLACKROCK_MOUNTAIN, Sets.HERO_SKINS, Sets.TAVERN_BRAWL, Sets.GRAND_TOURNAMENT)
    }

    override fun getTypes(): List<Types> {
        return mutableListOf(Types.HERO, Types.MINION, Types.SPELL, Types.ENCHANTMENT, Types.WEAPON, Types.HERO_POWER)
    }

    override fun getFactions(): List<Factions> {
        return mutableListOf(Factions.ALLIANCE, Factions.HORDE, Factions.NEUTRAL)
    }

    override fun getQualities(): List<Qualities> {
        return mutableListOf(Qualities.FREE, Qualities.COMMON, Qualities.RARE, Qualities.RARE, Qualities.LEGENDARY)
    }
}