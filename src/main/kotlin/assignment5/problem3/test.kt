package assignment5.problem3

fun main() {
    val movies = listOf<Movie>(
        Movie("Spider man","Marvel"),
        Movie("Batman","DC","+18"),
        Movie("Salah El Din","Asmhan","PG21"),
    )
    val newMoviesList = Movie.getPg(movies)
    println(newMoviesList)

}