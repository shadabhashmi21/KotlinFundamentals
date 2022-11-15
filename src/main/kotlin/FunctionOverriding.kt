/*When inheriting, all the Classes, Variables and Methods are by default final.
* Hence, when we override these, we have to first mark them as open*/

fun main() {
    val dog = MyDog()
    println(dog.color)
    dog.eat()
}

open class MyAnimal {
    open var color: String = "White"
    open fun eat() = println("Animal Eating")
}

class MyDog : MyAnimal() {
    var bread: String = ""
    override var color: String = "Black"

    fun bark() = println("Bark")

    override fun eat() {
        super.eat()
        println("Dog is eating")
    }
}