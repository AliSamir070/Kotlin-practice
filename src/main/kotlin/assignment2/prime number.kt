package assignment2

fun main() {
    println("Enter a number")
    val number = (readLine()?:"0").toInt()
    var isPrime = false
    for(i in 2 until number){
        if(number%i==0){
            isPrime = true
        }
    }
    if(!isPrime){
        println("Number is prime")
    }else{
        println("Number is not prime")
    }
}