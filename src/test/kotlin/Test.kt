import org.junit.jupiter.api.Test
import org.junit.platform.commons.annotation.Testable
import kotlin.test.assertEquals

@Testable
class Test {

    @Test
    fun upperBoundaryTest() {
        val (k, s) = listOf(2, 2)
//        solve(k, s)
    }

    @Test
    fun lowerBoundaryTest() {
        val (k, s) = listOf(5, 15)
        assertEquals(6, solve("B"))
    }
}
