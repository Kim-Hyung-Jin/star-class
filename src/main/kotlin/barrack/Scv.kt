package barrack

import base.skill.RepairAble
import base.unit.WorkerMoveAbleUnit

class Scv: WorkerMoveAbleUnit, RepairAble {
    override fun move() {
        println("svc move")
    }

    override val damages: Int
        get() = 8

    override fun attack() {
        println("svc attack damages: $damages")
    }

    override fun extractResource() {
        println("svc extractResource")
    }

    override fun returnResource() {
        println("svc returnResource")
    }

}