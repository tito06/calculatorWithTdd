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
}