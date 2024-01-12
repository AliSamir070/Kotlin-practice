package assignment5.problem1

class BankAccount(var balance:Double = 0.0) {
    companion object{
        var idGenerator = 0
    }
    val accountID:Int by lazy {
        ++idGenerator
    }

    fun withdraw(amount:Double):Boolean{
        if(amount>balance){
            println("No sufficient balance")
            return false
        }
        if(amount<0){
            println("Not valid")
            return false
        }
        balance-=amount
        return true
    }

    fun deposit(amount:Double):Boolean{
        if(amount<0){
            println("Not valid")
            return false
        }
        balance+=amount
        return true
    }

}