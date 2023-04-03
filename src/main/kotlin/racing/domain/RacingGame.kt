package racing.domain

class RacingGame(val cars: Cars, var gameCount: GameCount, val numberGenerator: NumberGenerator) {
    fun run(statusOfCars: (Cars) -> Unit) {
        while (gameCount--.value > 0) {
            startMatchOnce()
        }
        statusOfCars(cars)
    }

    private fun startMatchOnce() {
        cars.value.forEach {
            it.move(numberGenerator.generate())
        }
    }
}
