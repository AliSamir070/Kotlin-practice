package assignment1

fun main() {
    println("Enter yor age")
    val age = (readLine()?:"0").toInt()
    if(age>=21){
        println("Congratulation! You are eligible for casting your vote")
    }else{
        println("Sorry, your are not eligible")
    }
}