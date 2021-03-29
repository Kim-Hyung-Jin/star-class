package base.unit

interface MoveAbleUnit: Unit {

    fun move()
    fun stop() { println("stop") }


}