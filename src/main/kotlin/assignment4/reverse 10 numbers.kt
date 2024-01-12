package assignment4

fun main() {
    val numbersList = mutableListOf<Int>()
    for (i in 1..10){
        println("Enter a number")
        val number = (readLine()?:"0").toInt()
        numbersList.add(number)
    }
    for (i in numbersList.reversed()){
        println(i)
    }
}