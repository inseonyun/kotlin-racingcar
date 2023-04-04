package racing.domain

class RacingGame(private val cars: Cars, private var gameCount: GameCount, private val numberGenerator: NumberGenerator) {
    fun run(statusOfCars: (Cars) -> Unit) {
        while (gameCount--.value > 0) {
            startMatchOnce()
            statusOfCars(cars)
        }
    }

    fun determineWinners(): Names {
        val max = cars.value.maxBy { it.position.value }.position
        return Names(cars.value.filter { it.position == max }.map { it.name })
    }

    private fun startMatchOnce() {
        cars.value.forEach {
            it.move(numberGenerator.generate())
        }
    }
}
