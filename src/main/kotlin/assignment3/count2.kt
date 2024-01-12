package assignment3

fun main() {
    val numbersList = listOf(1, 5, 2, 2, 5, 2)
    val number2Frequency = countNumber2(numbersList)
    print("Number 2 found $number2Frequency")
}

fun countNumber2(numbersList: List<Int>):Int{
    var counter = 0
    for(i in numbersList){
        if(i==2){
            counter++
        }
    }
    return  counter
}