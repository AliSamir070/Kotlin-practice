package assignment6.problem3

class Rectangle(val length:Int , val width:Int,color:String):Shape(color) {
    override fun getArea():Double {
        return (length * width).toDouble()
    }

    override fun toString(): String {
        return "Rectangle of length : $length , width : $width"
    }
}