package money

import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertNull

class MoneyTest {

    @Test
    fun tetMultiplication() {
        val five = dollar(5)
        assertEquals(dollar(10), five*2)
    }
}
