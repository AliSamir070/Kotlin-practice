package practice.session5

class MyRectangle (val width:Double , val height:Double) {

    init{
        println("Rectangle of height $height and width $width")
    }

    override fun toString():String{
        return "MyRectangle"
    }
    fun area() = height * width

    fun perimeter() = (height + width)*2

    fun isSquare() = height == width
    fun display(){

        println("Rectangle of area: ${area()}")
        println("Rectangle of perimeter: ${perimeter()}")
        println("Rectangle is square: ${isSquare()}")
    }
}