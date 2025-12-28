import org.example.StringCalculator
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class StringCalculatorTest {

    @Test
    fun emptyStringReturnsZero(){
        val calculator = StringCalculator()
        val result = calculator.add("")
        assertEquals(0, result)

    }

    @Test
    fun `should return sum of multiple numbers`() {
        val calculator = StringCalculator()
        val result = calculator.add("1,2,3,4")
        assertEquals(10, result)
    }

    @Test
    fun `should support newline as delimiters`() {
        val calculator = StringCalculator()
        val result = calculator.add("1\n2,3")
        assertEquals(6, result)
    }

    @Test
    fun `should supporty custom delimiters`() {
        val calculator = StringCalculator()
        val result = calculator.add("//:1;2")
        assertEquals(3, result)
    }
}