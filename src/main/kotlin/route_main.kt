import java.util.*

fun main() {
    println("Enter a message")
    val userInput = readLine()
    println((userInput?.toInt()?:0) - 5)
}