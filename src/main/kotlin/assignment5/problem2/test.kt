package assignment5.problem2

fun main() {
    val holiday1 = Holiday("Independence",26,"July")
    val holiday2 = Holiday("6 October",6,"July")
    println(Holiday.inSameMonth(holiday1 , holiday2))

    val holidaysList = listOf<Holiday>(
        Holiday("tahrir sinai",25,"April"),
        Holiday("Chrismas",1,"Jan"),
        Holiday("25 jan",25,"Jan"),
    )
    val average = Holiday.avgDate(holidaysList)
    println("Average $average")
}