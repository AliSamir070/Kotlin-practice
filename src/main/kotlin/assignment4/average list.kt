package assignment4

fun main() {
    val numbersList = mutableListOf<Int>()
    inputList(numbersList = numbersList)
    val average = averageList(numbersList)
    println("The average : $average")
}

fun averageList(numbersList: MutableList<Int>):Double{
    var sum = 0
    for (i in numbersList){
        sum+=i
    }
    return  sum.toDouble()/numbersList.size
}