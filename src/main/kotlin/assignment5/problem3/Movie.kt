package assignment5.problem3

class Movie(val title:String , val studio:String , val rating:String = "PG") {
    override fun toString(): String {
        return "Movie ( $title : $studio : $rating )"
    }

    companion object{
        fun getPg(movies:List<Movie>):MutableList<Movie>{
            val newMoviesList = mutableListOf<Movie>()
            for (mov in movies){
                if(mov.rating.contains("PG")){
                    newMoviesList.add(mov)
                }
            }
            return newMoviesList
        }
    }
}