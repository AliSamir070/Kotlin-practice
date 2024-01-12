package assignment2

fun main() {
    println("How many numbers you want to check?")
    val input =(readLine()?:"0").toInt()
    var positive = 0
    var negative = 0
    var zeros = 0
    for (i in 1..input){
        println("Enter a number")
        val number = (readLine()?:"0").toInt()
        if(number>0){
            positive++
        }else if(number<0){
            negative++
        }else{
            zeros++
        }
    }
    println("You Entered $positive positive numbers , $negative negative and $zeros Zero")
}