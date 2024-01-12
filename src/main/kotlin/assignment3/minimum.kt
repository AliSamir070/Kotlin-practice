package assignment3

fun main() {
    val numbersLIst = arrayOf(8, 0, -1, 5)
    val min = getMin(numbersLIst)
    println("The minimum of this list: $min")
}

fun getMin(numbers:Array<Int>):Int{
    var min = numbers[0]
    for (i in numbers){
        if(i<min){
            min = i
        }
    }
    return min
}