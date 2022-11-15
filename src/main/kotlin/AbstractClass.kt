fun main(){}

/*All the abstract Classes and function are by default open.
* So we don't need to use "open" keyword here explicitly*/
abstract class Person{
    // Same as functions, an abstract variable cannot be instantiated
    abstract var name: String

    abstract fun eat() // Abstract method
    fun code() {} // Concrete method
    open fun sleep() {} // Concrete method
}

class Coders: Person(){
    override var name: String = "coders"

    override fun eat() {
        TODO("Not yet implemented")
    }

}