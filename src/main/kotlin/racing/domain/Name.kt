package racing.domain

@JvmInline
value class Name(val value: String) {
    init {
        require(value.length in (MIN_CAR_NAME_LENGTH_CONDITION..MAX_CAR_NAME_LENGTH_CONDITION)) { ERROR_OVER_NAME_LENGTH }
    }

    override fun toString(): String {
        return value
    }

    companion object {
        private const val MIN_CAR_NAME_LENGTH_CONDITION = 1
        private const val MAX_CAR_NAME_LENGTH_CONDITION = 5
        private const val ERROR_OVER_NAME_LENGTH = "이름은 1자 이상 5자를 이하여야 합니다"
    }
}
