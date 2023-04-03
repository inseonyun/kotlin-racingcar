package racing.view

import racing.domain.Car
import racing.domain.Cars
import racing.domain.Names
import racing.domain.Position

class OutputView {
    fun printStatusOfCars(cars: Cars) {
        cars.value.forEach {
            printStatusOfCar(it)
        }
        println()
    }

    fun printGameResult(names: Names) {
        print(FINAL_WINNER)
        println(names.value.joinToString(", "))
    }

    private fun printStatusOfCar(car: Car) {
        print(CAR_NAME_FORMAT.format(car.name.value))
        printPosition(car.position)
        println()
    }

    private fun printPosition(position: Position) {
        repeat(position.value) {
            print(CAR_POSITION_MARK)
        }
    }

    companion object {
        private const val CAR_POSITION_MARK = "-"
        private const val CAR_NAME_FORMAT = "%s : "
        private const val FINAL_WINNER = "최종 우승자: "
    }
}
