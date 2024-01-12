package practice

fun main() {
    println("Enter the first number")
    val n1 = (readLine()?:"0").toInt()
    println("Enter the second number")
    val n2 = (readLine()?:"0").toInt()
    println("Enter the third number")
    val n3 = (readLine()?:"0").toInt()
    if(n1>n2 && n1>n3){
        println("N1 is max")
    }else if(n2>n1 && n2>n3){
        println("N2 is max")
    }else{
        println("N3 is max")
    }
}