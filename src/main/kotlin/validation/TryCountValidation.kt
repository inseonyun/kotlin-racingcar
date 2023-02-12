package validation

object TryCountValidation {
    fun checkTryCount(tryCount: String) {
        checkTryCountInteger(tryCount)
        checkTryCountPositive(tryCount)
    }

    fun checkTryCountInteger(tryCount: String) {
        require(tryCount.chars().allMatch { Character.isDigit(it) }) {
            TRY_COUNT_INTEGER_ERROR_MESSAGE
        }
    }

    fun checkTryCountPositive(tryCount: String) {
        require(tryCount.toInt() >= MINIMUM_TRY_COUNT) {
            TRY_COUNT_POSITIVE_ERROR_MESSAGE
        }
    }

    private const val MINIMUM_TRY_COUNT = 1

    private const val TRY_COUNT_INTEGER_ERROR_MESSAGE = "[ERROR] 시도 횟수는 숫자만 입력해 주세요"
    private const val TRY_COUNT_POSITIVE_ERROR_MESSAGE = "[ERROR] 시도 횟수는 양의 정수여야 합니다"
}
