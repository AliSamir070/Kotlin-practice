package practice

fun main() {
    println("Enter two numbers")
    println("Enter first number")
    val number1 = (readLine()?:"0").toInt()
    println("Enter second number")
    val number2 = (readLine()?:"0").toInt()
    println("Choose operation option")
    println("1- Addition")
    println("2- Subtraction")
    println("3- Multiplication")
    println("4- Division")
    val operation = (readLine()?:"0").toInt()
    var result:Int
    if (operation == 1){
        result = number1 + number2
        println("Result = $result")
    }else if (operation == 2){
        result = number1 - number2
        println("Result = $result")
    }else if(operation == 3){
        result = number1 * number2
        println("Result = $result")
    }else if(operation == 4){
        if(number2 ==0){
            println("You can't divide by zero")
            return
        }
        result = number1 / number2
        println("Result = $result")
    }else{
        println("Wrong operation")
    }
}