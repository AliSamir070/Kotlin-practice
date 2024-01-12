package assignment1

fun main() {
    println("Enter a character")
    var character: String = readLine()?:""
    character = character.lowercase()
    if(character=="a" || character=="o" || character=="u" || character=="i" || character=="e"){
        println("This char is vowel")
    }else{
        println("constant")
    }
}