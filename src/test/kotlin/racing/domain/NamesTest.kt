package racing.domain

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class NamesTest {
    @Test
    fun `이름이 중복되면 예외가 발생한다`() {
        assertThrows<IllegalArgumentException> { Names("jason", "jason") }
    }

    companion object {
        private fun Names(vararg names: String): Names = Names(names.toList().map(::Name))
    }
}
