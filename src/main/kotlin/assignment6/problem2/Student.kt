package assignment6.problem2

class Student(name:String , address:String):Person(name , address) {
    var numCourses = 0
    val courses = mutableListOf<String>()
    val grades = mutableListOf<Int>()

    fun addCourseGrade(course:String , grade:Int){
        if (!courses.contains(course)){
            courses.add(course)
            numCourses++
            grades.add(grade)
        }
    }
    fun printGrades(){
        for (i in grades){
            println(i)
        }
    }
    fun getAverageGrades():Double{
        var sum = 0.0
        for (i in grades){
            sum+=i
        }
        return sum/grades.size
    }
    override fun toString(): String {
        return "Student: $name($address)"
    }
}