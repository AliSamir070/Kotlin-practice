package assignment4

fun main() {
    val numbersList = mutableListOf<Int>()
    println("Enter numbers between 1 and 100")
    println("Enter a number")
    var number = (readLine()?:"0").toInt()
    while (number in 1 until 100){
        numbersList.add(number)
        println("Enter a number")
        number = (readLine()?:"0").toInt()
    }
    countOccurrences(numbersList)

}

fun countOccurrences(numbersList: MutableList<Int>){
    val numbersOccurrence = hashMapOf<Int,Int>()
    for (i in numbersList){
        if (numbersOccurrence.containsKey(i)){
            numbersOccurrence.put(i,(numbersOccurrence[i]?:0)+1)
        }else{
            numbersOccurrence.put(i,1)
        }
    }
    for (i in numbersOccurrence.keys){
        println("$i occurs ${numbersOccurrence[i]} ${if((numbersOccurrence[i]?:0)>1)"times" else "time"}")
    }
}