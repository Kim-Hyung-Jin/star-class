package barrack


import base.skill.ClockingAble
import base.unit.AttackMoveAbleUnit

class Ghost: AttackMoveAbleUnit, ClockingAble {

//    fun steamPackSkill() {
//        val streamPack = StreamPackSkill()
//        println(streamPack.name)
//    }

    override fun move() {
        println("Ghost move")
    }

    override val damages: Int
        get() = 10

    override fun attack() {
        println("Ghost damages: $damages")
    }

    override fun patrol() {
        println("Ghost patrol")
    }


}