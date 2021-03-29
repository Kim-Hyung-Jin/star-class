package factory

import base.skill.MineAble
import base.unit.AttackMoveAbleUnit

class Vulture: AttackMoveAbleUnit, MineAble {

    override fun move() {
        println("Vulture move")
    }

    override val damages: Int
        get() = 20

    override fun attack() {
        println("Vulture damages: $damages")
    }

    override var mineCount: Int
        get() = 3
        set(value) {}

}