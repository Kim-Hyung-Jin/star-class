package factory

import base.unit.AttackMoveAbleUnit

class Tank: AttackMoveAbleUnit {
    private val isSizeMode: Boolean = false

    override fun move() {
        if(isSizeMode) {
            println("size mode cannot move")
        }else {
            println("Tank move")
        }
    }

    override val damages: Int
        get() = 30
    // 어캐할까
    override fun attack() {
        TODO("Not yet implemented")
    }

    // 시즈모드를 하면 위에 3개가 다 바뀌네
}