fun main(){
    val str1 = "Are "
    val str2 = "You"

    val str3 = "How "

    println(str3.add(str1, str2))
}


//Example of extension function
fun String.add(s1: String, s2: String): String {
    //This refers to the object for which the method is called, which is str3 in our scenario
    return this + s1 + s2
}

