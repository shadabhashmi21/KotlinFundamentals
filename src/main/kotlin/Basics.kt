fun main(){
    // mutable variable
    var text1 = "This variable can be reinitialized"
    text1 = "Here, it is reinitialized"
    println(text1)

    // immutable variable
    val text2 = "This variable cannot be reinitialized"
    //text2 = "See Yourself, that's why this line is commented out"
    println(text2)

    /*In Kotlin, we don't have the charAt method for String
    * Instead we just pass the index as demonstrated below*/
    val str = "My String"
    println(str[0])
}