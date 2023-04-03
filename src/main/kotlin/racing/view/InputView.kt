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
            .getOrDefault(readNames())

    fun readGameCount(): GameCount =
        runCatching {
            println(MESSAGE_INPUT_GAME_COUNT)
            GameCount(readln().toInt())
        }
            .onFailure {
                println(it.message)
            }
            .getOrDefault(readGameCount())

    companion object {
        private const val MESSAGE_INPUT_NAMES = "경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분)."
        private const val MESSAGE_INPUT_GAME_COUNT = "시도할 횟수는 몇 회인가요?"
    }
}
