package racing

import racing.controller.RacingController
import racing.view.InputView
import racing.view.OutputView

fun main() {
    runCatching {
        RacingController(InputView(), OutputView()).run()
    }
        .onFailure {
            println(it.message)
        }
}
