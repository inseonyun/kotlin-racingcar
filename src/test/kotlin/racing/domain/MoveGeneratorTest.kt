package racing.domain

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertDoesNotThrow

class MoveGeneratorTest {
    private val sequentialMoveGenerator = SequentialMoveGenerator()

    @Test
    fun `0부터 9사이의 수 하나를 뽑을 수 있다`() {
        assertDoesNotThrow { sequentialMoveGenerator.generate() }
    }
}
