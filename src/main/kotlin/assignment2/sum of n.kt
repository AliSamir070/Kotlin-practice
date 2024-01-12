package assignment2

fun main() {
    val input = (readLine()?:"0").toInt()
    var sum = 0
    for(i in 1..input){
        sum+=i
    }
    print("The Sum of Natural Number upto $input terms : $sum")
}