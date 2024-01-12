package assignment2

fun main() {
    println("Enter a number to check factorial")
    val number = (readLine()?:"0").toInt()
    var factorial = 1
    for(i in number downTo 1){
        factorial*=i
    }
    println("Factorial: $factorial")
}