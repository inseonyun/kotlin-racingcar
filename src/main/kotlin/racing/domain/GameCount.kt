package racing.domain

@JvmInline
value class GameCount(val value: Int) {
    operator fun dec(): GameCount = GameCount(value - 1)
}
