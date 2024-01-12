package assignment5.problem1

fun main() {
    val account = BankAccount()
    println(account.balance)
    println(account.accountID)
    println("+++++++++++++++++++++++++++++++++++++")
    val account2 = BankAccount(balance = 1500.toDouble())
    println(account2.balance)
    println(account2.accountID)
    println(BankAccount.idGenerator)
}