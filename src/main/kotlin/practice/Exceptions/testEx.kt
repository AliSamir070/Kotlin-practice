fun main() {
    val division = try{
        Divide(5.0, 1.0)
    }catch(e:DivideBYZeroExc){
        0
    }
    println("Result of division : $division")
    /*println("Enter a number : ")
    var input:Int? = null
    while(true){
        try{
            input = readLine()?.toInt()
            break
        }catch(e:NumberFormatException){
            continue
        }finally{
            println("This is finally block")
        }
    }
    println("You entered : $input")*/
}
class DivideBYZeroExc : Exception("You can't divide by zero")

fun Divide(a:Double , b:Double):Double{
    if(b==0.0){
        throw(DivideBYZeroExc())
    }
    return a/b
}