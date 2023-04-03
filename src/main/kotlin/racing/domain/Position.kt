package racing.domain

@JvmInline
value class Position(val value: Int) {
    operator fun inc(): Position = Position(value + 1)
}
