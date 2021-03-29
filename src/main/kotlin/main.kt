import barrack.Marin
import barrack.Scv
import base.skill.*
import base.unit.MoveAbleUnit
import base.unit.Unit
import base.unit.WorkerMoveAbleUnit
import factory.Vulture

fun main(args: Array<String>) {
    val marin: Unit = Marin()

    println("marin ${marin}")

    if(marin is AttackAble) {
        marin.attack()
    }

    if(marin is AdvancedMoveAble) {
        marin.hold()
        marin.patrol()
    }

    if(marin is SteampackAble) {
        marin.steampack()
    }

    if(marin is MoveAbleUnit) {
        println("marin ${marin.move()}")
        println("marin ${marin.stop()}")
    }



    val scv: Unit = Scv()

    if(scv is AttackAble) {
        scv.attack()
    }

    if(scv is WorkerMoveAbleUnit) {
        scv.extractResource()
        scv.returnResource()
    }

    if(scv is RepairAble) {
        scv.repair()
    }

    if(scv is MoveAbleUnit) {
        println("scv ${scv.move()}")
        println("scv ${scv.stop()}")

    }


    val vulture: MoveAbleUnit = Vulture()

    if(vulture is AttackAble) {
        vulture.attack()
    }

    if(vulture is MineAble) {
        val mine: Unit = vulture.setMine()
        println("마인 생성 $mine")
    }

    if(vulture is MoveAbleUnit) {
        println("vulture ${vulture.move()}")
        println("vulture ${vulture.stop()}")

    }


}