package barrack


import base.unit.NoneAttackMoveAbleUnit

class Medic: NoneAttackMoveAbleUnit {


    override fun move() {
        println("marin move")
    }


    override fun patrol() {
        println("marin patrol")
    }


}