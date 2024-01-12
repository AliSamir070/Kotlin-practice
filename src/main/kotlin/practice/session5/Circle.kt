class Circle (val radius:Double){

    init{
        println("Circle created with radius $radius")
    }

    val pi = 3.14

    fun area()=radius * radius * pi

    fun perimeter()= 2 * radius * pi

    fun display(){
        println("Circle with area : ${area()}")
        println("Circle with perimeter : ${perimeter()}")
    }
}