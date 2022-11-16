fun main(){
    CustomersData.count = 98
    CustomersData.typeOfCustomers()
    println(CustomersData.count)

    println(CustomersData.typeOfCustomers())

    CustomersData.count = 109
    println(CustomersData.count)

    CustomersData.myMethod("hello")
}

open class MySuperClass{
    open fun myMethod(str: String) = println("MySuperClass myMethod called")
}

/*Whenever we have to use static values, we declare them in Object rather than Class.
* Similar to static in Java*/
object CustomersData: MySuperClass() {

    init {
        println("Init Called")
    }

    var count: Int = -1             // Behaves like a STATIC variable

    fun typeOfCustomers(): String { // Behaves like a STATIC method
        return "Indian"
    }

    override fun myMethod(str: String) {    // Currently, behaving like a STATIC method
        super.myMethod(str)
        println("Object myMethod called")
    }
}