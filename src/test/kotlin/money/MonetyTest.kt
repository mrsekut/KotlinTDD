package money

import org.junit.Test
import money.Dollar
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import kotlin.test.assertFalse

class MoneyTest {

    @Test
    fun tetMultiplication() {
        val five = Dollar(5)

        var product = five.times(2)
        assertEquals(10, product.amount)

        product = five.times(3)
        assertEquals(15, product.amount)
    }

    @Test
    fun testEquality() {
        assertTrue(Dollar(5).equals(Dollar(5)))
        assertFalse(Dollar(5).equals(Dollar(6)))
    }
}