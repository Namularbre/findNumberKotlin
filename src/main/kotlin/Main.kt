import java.util.*

fun main() {
    var tries = 0
    var userGuess = askRandomInt()
    val mysteriousNumber = getRandomInt()

    while (userGuess != mysteriousNumber) {
        tries++
        giveHelp(userGuess, mysteriousNumber)
        userGuess = askRandomInt()
    }

    println("You found the number with $tries tries")
}

fun giveHelp(userGuess: Int, mysteriousNumber: Int) {
    if (userGuess > mysteriousNumber) {
        println("To much")
    } else if (userGuess < mysteriousNumber) {
        println("Not enough")
    }
}

fun askRandomInt(): Int {
    val reader = Scanner(System.`in`)
    println("Write the number: ")
    return try {
        reader.nextInt()
    } catch (e: InputMismatchException) {
        println("/!\\ You need to enter an integer !")
        askRandomInt()
    }
}

fun getRandomInt() = (0..100).random()
