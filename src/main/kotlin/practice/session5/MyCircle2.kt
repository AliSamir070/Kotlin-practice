package practice.session5

import Circle
import kotlin.random.Random

class Circle2 (val radius:Double,newName:String):Shape(newName){

   /* init{
        println("Circle name created with radius $radius")
    }*/

    companion object{
        fun randomCircle():Circle2{
            val randomRadius = Random.nextDouble(1.0, 10.0)
            return Circle2(randomRadius,"Random Circle")
        }
    }

    override fun toString(): String {
        return "I'm circle $name"
    }
    override fun area()=radius * radius * Constants.pi

    override fun perimeter()= 2 * radius * Constants.pi

    fun display(){
        println("Circle with area : ${area()}")
        println("Circle with perimeter : ${perimeter()}")
    }
}