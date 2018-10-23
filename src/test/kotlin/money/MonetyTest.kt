package money

import org.junit.Test
import money.Dollar
import kotlin.test.assertEquals
import kotlin.test.assertNull

class MoneyTest {

    @Test
    fun tetMultiplication() {
        val five = Dollar(5)

        var product = five.times(2)
        assertEquals(10, product.amount)

        product = five.times(3)
        assertEquals(15, product.amount)
    }
}