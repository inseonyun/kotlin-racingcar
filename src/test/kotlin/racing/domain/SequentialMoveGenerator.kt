package racing.domain

class SequentialMoveGenerator : NumberGenerator {
    private val numbers = (0..9).toList()
    private var index = 0
    override fun generate(): Int = numbers[index++]
}
