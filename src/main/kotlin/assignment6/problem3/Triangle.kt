package assignment6.problem3

class Triangle(val base:Int , val height:Int,color:String):Shape(color) {
    override fun getArea(): Double {
        return (0.5 * base *height)
    }

    override fun toString(): String {
        return "Triangle of base : $base and height : $height"
    }

}