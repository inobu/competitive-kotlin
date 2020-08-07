import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Test {

    @Test
    fun upperBoundaryTest() {
        solve(1, 1, listOf(1))
    }

    @Test
    fun lowerBoundaryTest() {
        assertEquals(0, solve(0, 1, listOf(1)))
    }
}
