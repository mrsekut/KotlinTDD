package money

class Dollar (var amount: Int) {
    fun times(multiplier: Int): Dollar { 
        return Dollar(amount * multiplier)
    }

    override fun equals(other: Any?): Boolean {
        val dollar: Dollar = other as Dollar
        return amount == dollar.amount
    }
}

// fun main(args: Array<String>) {
//     val five = Dollar(5)
//     var pro = five.times(2)
//     println(pro.amount)
// }