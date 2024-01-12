package assignment1

fun main() {
    println("Enter the first number")
    val n1 = (readLine()?:"0").toDouble()
    println("Enter the second number")
    val n2 = (readLine()?:"0").toDouble()
    println("Enter the third number")
    val n3 = (readLine()?:"0").toDouble()

    if (n1>=n2 && n1>=n3){
        println(n1)
        if(n2>=n3){
            println(n2)
            println(n3)
        }else{
            println(n3)
            println(n2)
        }
    } else if (n2>=n1 && n2>=n3){
        println(n2)
        if(n1>=n3){
            println(n1)
            println(n3)
        }else{
            println(n3)
            println(n1)
        }
    }else if (n3>=n1 && n3>=n2){
        println(n3)
        if(n2>=n1){
            println(n2)
            println(n1)
        }else{
            println(n1)
            println(n2)
        }
    }
}