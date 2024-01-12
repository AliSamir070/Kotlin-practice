package practice.session5

import Circle

fun main() {
    val r:MyRectangle2 = MyRectangle2(20.0, 10.0,"wael")
    println(r)
    r.changeName("Hassan")
    println(r)

    Circle2.randomCircle()

    // anony classes
    val parallelogram = object:Shape("Parallelogram"){
        override fun area(): Double {
            TODO("Not yet implemented")
        }

        override fun perimeter(): Double {
            TODO("Not yet implemented")
        }

    }

}
