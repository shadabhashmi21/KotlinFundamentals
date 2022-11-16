fun main(){
    //var Listener = MyListener() // We cannot instantiate an interface

    val btn = MyButton()
    btn.onClick()
    btn.onResume()
}


/*NOTE: Unlike Java, Kotlin interface can contain both abstract and concrete method,
* but only abstract variables*/
/*NOTE: We can also override non-abstract method of interface because none of the interface methods
* are final (neither abstract nor concrete)*/

/*All the variables and methods, in an interface, are by default OPEN*/
interface MyFirstInterface {
    var name: String // abstract variable cannot be initialized
    fun onClick() // Abstract method
    fun onResume() = println("Interface1 onResume Pressed") // Concrete method
}

interface MySecondInterface{
    fun onResume() = println("Interface2 onResume Pressed")
}

class MyButton: MyFirstInterface, MySecondInterface{
    /*It is mandatory to implement abstract methods*/
    override var name: String = "I am vengeance"

    override fun onClick() {
        println("OnClick Pressed")
    }

    /*We can also override non-abstract methods, only it's not mandatory*/
    override fun onResume() {
        /*When inheriting 2 interface which contain method with same signature,
        * we have to mention the interface name explicitly as done below*/
        super<MyFirstInterface>.onResume()
        super<MySecondInterface>.onResume()
        println("Class OnResume Clicked")
    }
}