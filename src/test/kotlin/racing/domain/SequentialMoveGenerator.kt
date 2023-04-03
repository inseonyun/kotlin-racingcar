package racing.domain

class SequentialMoveGenerator(val numbers: List<Int> = (0..9).toList()) : NumberGenerator {
    private var index = 0
    override fun generate(): Int = numbers[index++]
}
