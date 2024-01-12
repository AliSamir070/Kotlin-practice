package practice.session5

abstract class Shape(var name:String){

    /*init{
        println("I'm super class")
    }*/
    abstract fun area():Double
    abstract fun perimeter():Double
    fun changeName(newName:String){
        name = newName
    }

}