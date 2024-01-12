package assignment4

fun main() {
    val numbersList = mutableListOf<Int>()
    inputList(numbersList)
    println("Enter number you want to search")
    val number = (readLine()?:"0").toInt()
    searchNumber(numbersList,number)
}

fun inputList(numbersList: MutableList<Int>){
    println("Enter a number")
    println("-1 to exit")
    var number = (readLine()?:"0").toInt()
    while (number>=0){
        numbersList.add(number)
        println("Enter a number")
        println("-1 to exit")
        number = (readLine()?:"0").toInt()
    }
}

fun searchNumber(numbersList: MutableList<Int>,number: Number){
    if (numbersList.contains(number)){
        println("Yes")
    }else{
        println("No")
    }
}