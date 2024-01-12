package assignment3

fun main() {
    val numbersList = mutableListOf(1, 2, 3, 1, 3, 6)
    countGeneral(numbersList)
}

fun countGeneral(numbersList:MutableList<Int>) {
    val numbersMap = hashMapOf<Int,Int>()
    for (i in numbersList){
        if(numbersMap.containsKey(i)){
            numbersMap.put(i,(numbersMap[i]?:0)+1)
        }else{
            numbersMap.putIfAbsent(i,1)
        }
    }
    for(i in numbersMap.keys){
        println("$i -> ${numbersMap[i]}")
    }
}