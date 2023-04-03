package racing.domain

@JvmInline
value class GameCount(val value: Int) {
    init {
        require(value >= MIN_GAME_COUNT) { ERROR_GAME_COUNT }
    }
    operator fun dec(): GameCount = GameCount(value - 1)

    companion object {
        private const val MIN_GAME_COUNT = 1
        private const val ERROR_GAME_COUNT = "최소 게임 시도 횟수는 1회입니다"
    }
}
