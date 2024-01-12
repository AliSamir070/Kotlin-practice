package assignment4

fun main() {
    val studentsList = mutableListOf<Int>()
    inputStudentsScores(studentsList)
    val bestScore = getBestScore(studentsList)
    for (i in studentsList.indices){
        if(studentsList[i]>=bestScore-10){
            println("Student ${i+1} score is ${studentsList[i]} and grade is A")
        } else if(studentsList[i]>=bestScore-20){
            println("Student ${i+1} score is ${studentsList[i]} and grade is B")
        } else if(studentsList[i]>=bestScore-30){
            println("Student ${i+1} score is ${studentsList[i]} and grade is C")
        } else if(studentsList[i]>=bestScore-40){
            println("Student ${i+1} score is ${studentsList[i]} and grade is D")
        }else{
            println("Student ${i+1} score is ${studentsList[i]} and grade is F")
        }
    }
}

fun inputStudentsScores(studentsList:MutableList<Int>){
    println("Enter the number of students")
    val numberOfStudents = (readLine()?:"0").toInt()
    print("Enter $numberOfStudents scores: ")
    for(i in 0 until numberOfStudents){
        val score = (readLine()?:"0").toInt()
        studentsList.add(score)
        println()
    }
}
fun getBestScore(studentsList:MutableList<Int>):Int{
    var max = studentsList[0]
    for(i in studentsList){
        if(i>max){
            max = i
        }
    }
    return max
}