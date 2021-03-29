package starport


import base.skill.ClockingAble
import base.unit.AttackMoveAbleUnit

class Race: AttackMoveAbleUnit, ClockingAble {

//    fun steamPackSkill() {
//        val streamPack = StreamPackSkill()
//        println(streamPack.name)
//    }

    override fun move() {
        println("Race move")
    }

    override val damages: Int
        get() = 10

    override fun attack() {
        println("Race damages: $damages")
    }

    override fun patrol() {
        println("Race patrol")
    }


}