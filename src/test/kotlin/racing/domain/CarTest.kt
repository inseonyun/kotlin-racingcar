package racing.domain

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertAll

class CarTest {
    @Test
    fun `자동차는 이름과 포지션을 갖는다`() {
        val car = Car("jason", 0)
        assertAll(
            { assertThat(car.name.value).isEqualTo("jason") },
            { assertThat(car.position.value).isEqualTo(0) }
        )
    }

    @Test
    fun `자동차는 4 이상이면 전진할 수 있다`() {
        val car = Car("jason", 0)
        car.move(4)
        assertThat(car.position.value).isEqualTo(1)
    }

    @Test
    fun `자동차는 4 미만이면 전진할 수 없다`() {
        val car = Car("jason", 0)
        car.move(3)
        assertThat(car.position.value).isEqualTo(0)
    }

    companion object {
        fun Car(name: String, position: Int): Car = Car(Name(name), Position(position))
    }
}
