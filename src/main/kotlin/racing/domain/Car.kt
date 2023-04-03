package racing.domain

class Car(val name: Name, var position: Position) {
    fun move(condition: Int) {
        if (condition >= CAR_MOVE_CONDITION)
            position++
    }

    companion object {
        private const val CAR_MOVE_CONDITION = 4
    }
}
