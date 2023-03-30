fun celsius(fahrenheit: Double): Double {
    return 5.0 / 9.0 * (fahrenheit - 32)
}

fun main() {
    println("Fahrenheit\tCelsius")
    for (f in 0..20) {
        val c = celsius(f.toDouble())
        println("$f\t\t${"%.2f".format(c)}")
    }
}
