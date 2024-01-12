package practice

fun main(){
    println("Enter a number of seconds")
    var numberOfSeconds = (readLine()?:"0").toInt()
    val hours = numberOfSeconds/3600
    numberOfSeconds%=3600
    val minutes = numberOfSeconds/60
    numberOfSeconds%=60
    println("We have $hours hours : $minutes minutes : $numberOfSeconds")

}