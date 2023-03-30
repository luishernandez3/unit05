fun main() {
    val wholesaleCost = getDoubleInput("Enter the item's wholesale cost: ")
    val markupPercentage = getDoubleInput("Enter the markup percentage: ")
    val retailPrice = calculateRetail(wholesaleCost, markupPercentage)
    println("The item's retail price is: $retailPrice")
}

fun calculateRetail(wholesaleCost: Double, markupPercentage: Double): Double {
    val markupAmount = wholesaleCost * markupPercentage / 100
    return wholesaleCost + markupAmount
}

fun getDoubleInput(prompt: String): Double {
    print(prompt)
    return readLine()?.toDoubleOrNull() ?: run {
        println("Invalid input. Please enter a number.")
        getDoubleInput(prompt)
    }
}
