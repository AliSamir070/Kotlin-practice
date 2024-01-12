package assignment4

fun main(){
    val numbersList = mutableListOf<Int>()
    inputList(numbersList)
    val  average = getAverage(numbersList)
    var belowAverage = 0
    var aboveAverage = 0
    var equalAverage = 0
    for(i in numbersList){
        if(i<average){
            belowAverage++
        }else if(i>average){
            aboveAverage++
        }else{
            equalAverage++
        }
    }
    println("Above average: $aboveAverage")
    println("Below average: $belowAverage")
    println("Equal average: $equalAverage")

}

fun getAverage(numbersList: MutableList<Int>):Double{
    var sum = 0.0
    for (i in numbersList){
        sum+=i
    }
    return sum/numbersList.size
}