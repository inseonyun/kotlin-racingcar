package racing.domain

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class GameCountTest {
    @Test
    fun `게임 시도 횟수 5를 1 차감하면 남은 시도 횟수는 4가 된다`() {
        var gameCount = GameCount(5)
        gameCount--
        assertThat(gameCount.value).isEqualTo(4)
    }
}
