package practice.session3

fun main() {
    val listFibo = mutableListOf(0,1)
    println("Enter a number")
    val number = (readLine()?:"0").toInt()
    for(i in 0 until number-2){
        listFibo.add(listFibo[i]+listFibo[i+1])
    }
    println(listFibo)
    println("Ali".lowercase())
}