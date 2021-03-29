package barrack


import base.skill.SteampackAble
import base.unit.AttackMoveAbleUnit

class Firebat: AttackMoveAbleUnit, SteampackAble {

//    fun steamPackSkill() {
//        val streamPack = StreamPackSkill()
//        println(streamPack.name)
//    }

    override fun move() {
        println("Firebat move")
    }

    override val damages: Int
        get() = 16

    override fun attack() {
        println("Firebat damages: $damages")
    }

    override fun patrol() {
        println("Firebat patrol")
    }


}