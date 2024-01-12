package assignment6.problem1

class Rectangle(val height:Double=1.0 , val width:Double=1.0,color:String = "White" , filled:Boolean = false):GeometricObject(color = color,filled = filled) {

    fun getPerimeter():Double{
        return (height + width)*2
    }
    fun getArea():Double{
        return height * width
    }
    override fun toString(): String {
        return "Rectangle: height = $height, width = $width"
    }
}