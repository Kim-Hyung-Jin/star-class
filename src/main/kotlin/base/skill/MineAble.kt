package base.skill

import factory.Mine

interface MineAble {

    var mineCount: Int

    fun setMine(): Mine {
        mineCount--
        return Mine()
    }
}