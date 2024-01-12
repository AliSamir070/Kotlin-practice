package assignment2

fun main() {
    println("Enter a number")
    val number = (readLine()?:"0").toInt()
    var sum = 0
    print("The odd numbers are: ")
    for(i in 1..number*2 step 2){
        sum+=i
        print("$i ")
    }
    println()
    println("The Sum of odd Natural Numbers upto $number terms: $sum")
}