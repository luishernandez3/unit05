import kotlin.random.Random

fun main() {
    var playAgain: Char
    do {
        val computerChoice = generateComputerChoice()
        val userChoice = getUserChoice()

        println("Computer chose ${computerChoice.capitalize()}.")
        val result = determineWinner(computerChoice, userChoice)

        when (result) {
            0 -> println("It's a tie!")
            1 -> println("You win!")
            -1 -> println("Computer wins!")
        }

        println("Do you want to play again? (y/n)")
        playAgain = readLine()?.get(0) ?: 'n'
    } while (playAgain == 'y')
}

fun generateComputerChoice(): String {
    val randomNum = Random.nextInt(1, 4)
    return when (randomNum) {
        1 -> "rock"
        2 -> "paper"
        else -> "scissors"
    }
}

fun getUserChoice(): String {
    var userChoice: String?
    do {
        println("Choose rock, paper, or scissors: ")
        userChoice = readLine()?.toLowerCase()
    } while (userChoice !in listOf("rock", "paper", "scissors"))
    return userChoice
}

fun determineWinner(computerChoice: String, userChoice: String): Int {
    return when {
        computerChoice == userChoice -> 0
        computerChoice == "rock" && userChoice == "scissors" ||
        computerChoice == "scissors" && userChoice == "paper" ||
        computerChoice == "paper" && userChoice == "rock" -> -1
        else -> 1
    }
}
