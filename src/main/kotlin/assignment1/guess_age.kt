package assignment1

fun main() {
    println("Enter your name")
    val name = readLine()?:""
    println("Enter your age")
    val age = (readLine()?:"0").toInt()
    println("You are about ")
    println("Hi, $name, you have ${100-age} years left to be 100 years old")
}