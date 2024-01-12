package practice.session5

class MyRectangle2 (val width:Double , val height:Double,newName:String):Shape(newName) {

    constructor(a:Double,name:String) : this(a ,a,name)

   /* init{
        println("Rectangle name of height $height and width $width")
    }*/

    override fun toString():String{
        return "MyRectangle $name"
    }
    override fun area() = height * width

    override fun perimeter() = (height + width)*2

    fun isSquare() = height == width
    fun display(){

        println("Rectangle of area: ${area()}")
        println("Rectangle of perimeter: ${perimeter()}")
        println("Rectangle is square: ${isSquare()}")
    }
}