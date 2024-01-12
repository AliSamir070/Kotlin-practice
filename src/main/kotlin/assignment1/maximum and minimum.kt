package assignment1

fun main() {
    println("Enter the first number")
    val n1 = (readLine()?:"0").toDouble()
    println("Enter the second number")
    val n2 = (readLine()?:"0").toDouble()
    println("Enter the third number")
    val n3 = (readLine()?:"0").toDouble()
    val max = if(n1>=n2 && n1>=n3) n1 else if(n2>=n1 && n2>=n3) n2 else n3
    val min = if(n1<=n2 && n1<=n3) n1 else if(n2<=n1 && n2<=n3) n2 else n3
    println("maximum is $max")
    println("minimum is $min")
}