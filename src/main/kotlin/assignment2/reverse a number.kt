package assignment2

fun main() {
    println("Enter a number")
    var number = (readLine()?:"0").toInt()
    while (number!=0){
        print(number%10)
        number /= 10
    }
}