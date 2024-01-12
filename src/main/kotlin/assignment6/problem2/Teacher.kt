package assignment6.problem2

class Teacher(name:String , address:String):Person(name , address) {
    var numCourses = 0
    val courses = mutableListOf<String>()

    fun addCourse(course:String):Boolean{
        if(!courses.contains(course)){
            courses.add(course)
            return true
        }
        return false
    }
    fun removeCourse(course:String):Boolean{
        if(courses.contains(course)){
            courses.remove(course)
            return true
        }
        return false
    }
    override fun toString(): String {
        return "Teacher: $name($address)"
    }
}