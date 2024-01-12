package assignment4

fun main() {
    val numbersList = mutableListOf<Int>()
    inputList(numbersList = numbersList)
    val secondMin = findSecondSmallest(numbersList)
    print("The second smallest : $secondMin")
}

fun findSecondSmallest(numbersList: MutableList<Int>):Int{
    var min = numbersList[0]
    var secondMin = numbersList[0]
    for(i in numbersList){
        if(i<min){
            secondMin = min
            min = i
        }else if(i<secondMin){
            secondMin = i
        }
    }
    return  secondMin
}