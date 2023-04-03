package racing.view

import racing.domain.GameCount
import racing.domain.Names

class InputView {
    fun readNames(): Names =
        runCatching {
            println(MESSAGE_INPUT_NAMES)
            Names.of(readln().replace(" ", "").split(","))
        }
            .onFailure {
                println(it.message)
            }
            .getOrElse { readNames() }

    fun readGameCount(): GameCount =
        runCatching {
            println(MESSAGE_INPUT_GAME_COUNT)
            val gameCount = readln().toInt()
            require(gameCount >= MIN_GAME_COUNT) { ERROR_GAME_COUNT }
            GameCount(gameCount)
        }
            .onFailure {
                println(it.message)
            }
            .getOrElse { readGameCount() }

    companion object {
        private const val MIN_GAME_COUNT = 1
        private const val MESSAGE_INPUT_NAMES = "경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분)."
        private const val MESSAGE_INPUT_GAME_COUNT = "시도할 횟수는 몇 회인가요?"
        private const val ERROR_GAME_COUNT = "최소 게임 시도 횟수는 1회입니다"
    }
}
