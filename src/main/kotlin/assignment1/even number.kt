package assignment1

fun main() {
    println("Enter a number")
    val number = (readLine()?:"0").toInt()
    if(number%2==0){
        println("Yes")
    }else{
        println("No")
    }
}