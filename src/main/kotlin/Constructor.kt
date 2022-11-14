fun main(){
    val student = Student("Wolverine", 142)

    student.name = "Deadpool"
    println(student.name)
    println(student.age)
}

// NOTE: We use var keyword in primary constructor to make the variable a class property
// Example of primary constructor
class Student(var name: String){
    var age = 0

    // init block is automatically executed on object creation
    init {
        println("Name is $name")
        println(age)
    }

    /*NOTE: We cannot declare properties in secondary constructor,
     i.e. we cannot use var keyword in secondary constructor*/
    constructor(name: String, age: Int) : this(name) {
        // The body of the secondary constructor is always called after the init block
        this.age = age
    }
}