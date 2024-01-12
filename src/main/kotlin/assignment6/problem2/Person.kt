package assignment6.problem2

abstract class Person(val name:String, val address:String) {
    override fun toString(): String {
        return "$name ($address)"
    }
}