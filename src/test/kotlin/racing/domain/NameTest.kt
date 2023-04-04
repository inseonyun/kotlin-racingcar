package racing.domain

import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

class NameTest {
    @ParameterizedTest
    @ValueSource(strings = ["", "banana"])
    fun `이름이 1자 이상 5자 이하가 아니면 예외가 발생한다`(name: String) {
        assertThrows<IllegalArgumentException> { Name(name) }
    }
}
