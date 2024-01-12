package assignment6.problem1

abstract  class GeometricObject(val color:String = "White",val filled:Boolean = false) {
    override fun toString(): String {
        return "Geometric Object ( color : $color , filled : $filled)"
    }
}