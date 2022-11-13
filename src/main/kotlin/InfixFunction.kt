/*Note -> All infix functions are extension function but all extension functions are not infix function.
* An infix function can only have one argument*/

fun main() {
    val x = 6
    val y = 8

    //println(x.greaterElement(y)) -> Traditional function calling style
    println(x greaterElement y) // infix method calling style
}

//Here if we try to accept two arguments in infix, the compiler will show error
infix fun Int.greaterElement(other: Int): Int {
    return if (this > other)
        this
    else
        other
}