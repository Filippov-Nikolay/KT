import kotlin.random.Random

class GuessingGame {
    private var numberToGuess = 0

    init {
        println("Гра \"Вгадай число\"")
        println("Введіть число від 0 до 100, яке комп'ютер буде вгадувати")
        numberToGuess = readLine()?.toIntOrNull() ?: Random.nextInt(101)
        println("Загадане число: $numberToGuess")
    }

    fun play() {
        var isCorrect = false
        var low = 0
        var high = 100

        while (!isCorrect) {
            val guess = (low + high) / 2
            println("Комп'ютер вгадує: $guess")

            when {
                guess < numberToGuess -> {
                    println("Загадане число більше")
                    low = guess + 1
                }
                guess > numberToGuess -> {
                    println("Загадане число менше")
                    high = guess - 1
                }
                else -> {
                    println("Комп'ютер вгадав число $numberToGuess!")
                    isCorrect = true
                }
            }
        }
    }
}

fun main() {
    val game = GuessingGame()
    game.play()
}