package starport


import base.skill.ShipAble
import base.unit.NoneAttackMoveAbleUnit

class DropShip: NoneAttackMoveAbleUnit, ShipAble {


    override fun move() {
        println("marin move")
    }


    override fun patrol() {
        println("marin patrol")
    }

    override fun RideOn() {
        println("DropShip RideOn")
    }

    override fun RideOff() {
        println("DropShip RideOff")
    }


}