fun main(){
    println(add(5,10))
    println(subtract(10,5))
}

fun add(x: Int, y: Int): Int {
    return x+y;
}

// Function expression example
fun subtract(x: Int, y: Int): Int = x-y