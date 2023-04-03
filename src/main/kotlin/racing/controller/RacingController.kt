package racing.controller

import racing.domain.Car
import racing.domain.Cars
import racing.domain.Position
import racing.domain.RacingGame
import racing.domain.RandomMoveGenerator
import racing.view.InputView
import racing.view.OutputView

class RacingController(
    private val inputView: InputView,
    private val outputView: OutputView
) {
    private val randomMoveGenerator = RandomMoveGenerator()

    fun run() {
        val cars = Cars(inputView.readNames().value.map { Car(it, Position(0)) })
        val gameCount = inputView.readGameCount()
        val racingGame = RacingGame(cars, gameCount, randomMoveGenerator)
        racingGame.run(outputView::printStatusOfCars)
        outputView.printGameResult(racingGame.determineWinners())
    }
}
