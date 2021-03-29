package barrack


import base.skill.SteampackAble
import base.unit.AttackMoveAbleUnit

class Marin: AttackMoveAbleUnit, SteampackAble {

//    fun steamPackSkill() {
//        val streamPack = StreamPackSkill()
//        println(streamPack.name)
//    }

    override fun move() {
        println("marin move")
    }

    override val damages: Int
        get() = 8

    override fun attack() {
        println("marin damages: $damages")
    }

    override fun patrol() {
        println("marin patrol")
    }


}