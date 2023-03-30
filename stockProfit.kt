fun calculateProfit(ns: Int, pp: Double, pc: Double, sp: Double, sc: Double): Double {
    val profit = ((ns * sp) - sc) - ((ns * pp) + pc)
    return profit
}
fun main() {
    print("Enter number of shares: ")
    val ns = readLine()!!.toInt()

    print("Enter purchase price per share: ")
    val pp = readLine()!!.toDouble()

    print("Enter purchase commission paid: ")
    val pc = readLine()!!.toDouble()

    print("Enter sale price per share: ")
    val sp = readLine()!!.toDouble()

    print("Enter sale commission paid: ")
    val sc = readLine()!!.toDouble()

    val profit = calculateProfit(ns, pp, pc, sp, sc)

    if (profit > 0) {
        println("The sale resulted in a profit of \$$profit.")
    } else if (profit < 0) {
        println("The sale resulted in a loss of \$$profit.")
    } else {
        println("The sale resulted in neither a profit nor a loss.")
    }
}
