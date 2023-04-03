package racing.domain

@JvmInline
value class Names(val value: List<Name>) {

    init {
        require(value.distinct().size == value.size) { ERROR_DUPLICATE_NAMES }
    }

    companion object {
        private const val ERROR_DUPLICATE_NAMES = "자동차 이름은 중복 될 수 없습니다"
        fun of(names: List<String>): Names = Names(names.map(::Name))
    }
}
