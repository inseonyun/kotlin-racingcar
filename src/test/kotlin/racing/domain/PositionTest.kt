package racing.domain

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PositionTest {
    @Test
    fun `포지션이 0일 때, 증감하게 되면 포지션은 1이 된다`() {
        var position = Position(0)
        position++
        assertThat(position.value).isEqualTo(1)
    }
}
