package assignment5.problem2

class Holiday(val name:String , val day:Int , val month:String) {

    companion object {
        fun inSameMonth(h1:Holiday , h2:Holiday):Boolean{
            if(h1.month == h2.month){
                return true
            }
            return false
        }

        fun avgDate(holidays:List<Holiday>):Double{
            var  sum = 0.0
            for (h in holidays){
                sum+=h.day
            }
            return sum/holidays.size
        }
    }
}