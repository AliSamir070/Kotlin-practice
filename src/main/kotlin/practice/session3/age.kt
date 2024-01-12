package practice.session3

fun main() {
    println("Enter your age")
    val age = (readLine()?:"0").toInt()
    when(age){
        in 0..5 -> println("You are kid")
        in 6..17 -> println("You are a teenager")
        18 -> println("Finally, you are 18")
        19,20 -> println("Young adult")
        in 21..65 -> println("You're an adult")
        else -> println("You're really old")
    }

}