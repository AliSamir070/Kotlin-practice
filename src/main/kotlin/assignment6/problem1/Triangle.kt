package assignment6.problem1

import kotlin.math.sqrt

class Triangle(val side1:Double = 1.0,val side2:Double = 1.0,val side3:Double = 1.0, color:String = "White",filled:Boolean):GeometricObject(color = color,filled = filled) {

    fun getArea():Double{
        val semiPerimeter = getPerimeter()/2
        val area = sqrt(semiPerimeter * (semiPerimeter-side1) * (semiPerimeter-side2) * (semiPerimeter-side3))
        return area
    }
    fun getPerimeter():Double{
        return  side1 + side2 + side3
    }

    override fun toString(): String {
        return "Triangle: side1 = $side1, side2 = $side2, side3 = $side3”"
    }
}