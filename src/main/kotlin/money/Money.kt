package money

class Dollar (var amount: Int) {
    fun times(multiplier: Int) { 
        amount *= multiplier
    }
}

// fun main(args: Array<String>) {
//     val five = Dollar(5)
//     five.times(2)
//     println(five.amount)
// }