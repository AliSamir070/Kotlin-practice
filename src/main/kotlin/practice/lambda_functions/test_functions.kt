import practice.session5.Circle2
import practice.session5.MyRectangle2
import practice.session5.Shape

fun main() {
    /*var list = (1..20).toList()
    println(list)
    list = list.filter { it%2==0 }
    println(list)*/
    val newSum = {
        n1:Int,n2:Int -> n1+n2
    }
    val numbers = (0..10).toList()
    numbers.customShapesFilter("Ahmed",{
        s,n->true
    })
    val result = doOperation(5,2, myFunction = newSum)
    println("Result : $result")
    var shapesList = listOf<Shape>(
        Circle2(20.0,"Circle1"),
        Circle2(30.0,"Circle2"),
        MyRectangle2(width = 20.0, height = 10.0,"Rectangle1"),
        MyRectangle2(width = 25.0, height = 15.0,"Rectangle2"),
    )
    println(shapesList)
    shapesList = shapesList.customShapesFilter(name = "Ali", filterFunction = {shap,name ->
        shap is Circle2
    })
    println(shapesList)
}

fun <T> List<T>.customShapesFilter(name:String,filterFunction:(T,String)->(Boolean)):List<T>{
    var newList = mutableListOf<T>()
    for (sh in this){
        if(filterFunction(sh,"A7A")){
            newList.add(sh)
        }
    }
    return newList
}

fun sum(no1: Int , no2: Int):Int{
    return no1 + no2
}
fun doOperation(no1:Int , no2:Int, myFunction:(Int,Int)->Int):Int{
    return myFunction(no1 , no2)
}

