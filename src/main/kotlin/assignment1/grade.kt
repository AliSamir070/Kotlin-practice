package assignment1

fun main() {
    println("Enter your grade")
    val grade = readLine()?:""
    when(grade.uppercase()){
        "A"->{
            println("Excellent")
        }
        "B"->{
            println("Outstanding")
        }
        "C"->{
            println("Good")
        }
        "D"->{
            println("Can Do Better")
        }
        "F"->{
            println("Failed !")
        }
        else -> {
            println("invalid grade")
        }
    }
}