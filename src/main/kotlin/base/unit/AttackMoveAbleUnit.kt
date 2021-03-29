package base.unit

import base.skill.AttackAble
import base.skill.AdvancedMoveAble


interface AttackMoveAbleUnit: MoveAbleUnit, AttackAble, AdvancedMoveAble {

}