package racing.domain

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertAll

class RacingGameTest {
    @Test
    fun `jason과 pobi의 무작위 수가 각각 4와 3일 때, 포지션은 1과 0이다`() {
        val jasonCar = Car("jason", 0)
        val pobiCar = Car("pobi", 0)
        val cars = Cars(jasonCar, pobiCar)

        val racingGame = RacingGame(cars, GameCount(1), SequentialMoveGenerator(listOf(4, 3)))
        racingGame.run {}

        assertAll(
            { assertThat(jasonCar.position.value).isEqualTo(1) },
            { assertThat(pobiCar.position.value).isEqualTo(0) }
        )
    }

    companion object {
        fun Car(name: String, position: Int): Car = Car(Name(name), Position(position))
        fun Cars(vararg cars: Car): Cars = Cars(cars.toList())
    }
}
