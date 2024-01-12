package practice.session4

fun main() {
    //ageAnalysis()
    println("Enter a number: ")
    val base = (readLine()?:"0").toInt()
    println("Enter a power: ")
    val power = (readLine()?:"0").toInt()
    val result = numberPower(base,power)
    println("$base to the power of $power is $result")
    println(multiply(4,4))
    val list = listOf<Int>(4,1,0)
    println(printFirstItem(list))
    val searchList = listOf<Int>(5,1,4,9,6)
    val searchIndex = searchNumber(0,searchList)
    if(searchIndex != -1){
        println("Number found at index $searchIndex")
    }else{
        println("Not found")
    }
}

fun ageAnalysis(){
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
fun searchNumber(number:Number,list: List<Int>):Int{
    for (i in list.indices){
        if(number == list[i]){
            return i
        }
    }
    return  -1
}
fun printFirstItem(list: List<Int>)=list[0]
fun multiply(number1:Int , number2:Int)= number1 * number2
fun numberPower(base:Int , power:Int):Int{
    var result = 1
    for(i in 1..power){
        result *= base
    }
    return result
}