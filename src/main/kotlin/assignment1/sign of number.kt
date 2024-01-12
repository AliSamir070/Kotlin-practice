package assignment1

fun main() {
    println("Enter a number")
    val number = (readLine()?:"0").toInt()
    if (number<0){
        println("Negative")
    }else if (number>0){
        println("Positive")
    }else{
        println("Zero")
    }
}