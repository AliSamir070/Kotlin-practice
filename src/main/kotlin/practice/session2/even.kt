package practice.session2

fun main() {
    val arr = arrayOf(4,2,5,0,1,10,9)
    var max = arr[0]
    for(i in arr.indices){
        if(arr[i]>max){
            max = arr[i]
        }
    }
    print("Maximum $max")

}