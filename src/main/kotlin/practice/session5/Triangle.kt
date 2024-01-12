package practice.session5

import java.lang.Math.sqrt

class Triangle (val a:Double , val b:Double , val c:Double,name:String):Shape(name){

    init{
        println("Triangle created with a:$a , b:$b , c:$c")
    }

    override fun area()=sqrt(perimeter()/2 * (perimeter()/2-a) * (perimeter()/2-b) * (perimeter()/2-c))

    override fun perimeter() = a + b + c


}