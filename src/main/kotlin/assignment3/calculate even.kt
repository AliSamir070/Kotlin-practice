package assignment3

fun main() {
    val numbersList = listOf<Int>(1, 4, 2, 5, -1, 8)
    val evenSum = calculateEven(numbersList)
    print("Even sum equal to: $evenSum")
}

fun calculateEven(numbers:List<Int>):Int{
    var sum = 0
    for (i in numbers){
        if(i%2==0){
            sum+=i
        }
    }
    return  sum
}