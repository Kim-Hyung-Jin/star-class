package starport


import base.skill.EmpAble
import base.unit.NoneAttackMoveAbleUnit

class Veshal: NoneAttackMoveAbleUnit, EmpAble {


    override fun move() {
        println("marin move")
    }


    override fun patrol() {
        println("marin patrol")
    }


}