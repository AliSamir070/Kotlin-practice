package practice.session4

fun main() {
    val arr = intArrayOf(10,100,151)
    val list = mutableListOf(5,5)
    val list2 = mutableListOf(5,6)
    list2.addAll(list)
    val maximum = getMax(5,1,3,6,88,*arr,3,7,12)
    println("The max: $maximum")
    searchForText("Liverpool")
    searchForText(searchEngine = "bingo", search = "aaah")
    val number = (readLine()?:"0").toInt()
    if(number.isPrime()){
        println("This number is prime")
    }else{
        println("Not prime")
    }
}




// extension function

fun Int.isPrime():Boolean{
    for(i in 2 until this){
        if(this % i == 0){
            return false;
        }
    }
    return true;
}
fun searchForText(search:String , searchEngine:String = "Google"){
    println("Search text : $search")
    println("Search Engine : $searchEngine")
}
fun getMax(vararg numbers:Int):Int{
    var max = numbers[0]
    for (i in numbers){
        if(i>max){
            max = i
        }
    }
    return  max
}