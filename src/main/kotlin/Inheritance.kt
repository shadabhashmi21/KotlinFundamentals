fun main(){
    val dog = Dog()
    dog.bread = "labra"
    dog.color = "black"
    dog.bark()
    dog.eat()

    val cat = Cat()
    cat.lives = 9
    cat.color = "brown"
    cat.meow()
    cat.eat()

    val animal = Animal()
    animal.color = "white"
    animal.eat()
}

/*In Kotlin, every class is public and final by default, and we can't extend any final class.
* So to remove the final property of a class, we use the "open" keyword.*/
open class Animal {
    open var color = ""
    open fun eat() = println("Animal Eat")
}

class Dog: Animal(){
    var bread = ""
    fun bark() = println("Dog Bark")
}

class Cat: Animal(){
    var lives = -1
    fun meow() = println("Cat Meow")
}