package assignment1

fun main() {
    val pi = 3.14
    println("Enter the radius of cylinder")
    val radius = (readLine()?:"0").toDouble()
    println("Enter the length of cylinder")
    val length = (readLine()?:"0").toDouble()
    val area = radius*radius*pi
    val volume = area*length
    println("The volume is $volume")
}