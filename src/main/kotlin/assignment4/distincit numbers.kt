package assignment4

fun main() {
    val numbersList = mutableListOf<Int>()
    for (i in 1..10){
        println("Enter a number")
        val number = (readLine()?:"0").toInt()
        if (!numbersList.contains(number)){
            numbersList.add(number)
        }
    }
    println("The number of distinct number is ${numbersList.size}")
    print("The distinct numbers are: ")
    for (i in numbersList){
        print("$i ")
    }
}