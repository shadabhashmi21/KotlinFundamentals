fun main(){
    val program = Program()
    var result = 0

    //Lambda expression
    val lambda: (Int, Int) -> Int = {x: Int, y: Int -> x + y} // The last expression "x + y" is the method body
    program.add(5,10, lambda)

    //Alternative approach, without using a variable
    program.add(10, 12) { x, y -> x + y }
    //program.add(10, 12, { x, y -> x + y }) // Outdated approach

    // We are reassigning the outer variable "result" inside the Lambda expression
    program.subtract(35, 10) {x,y -> result = x - y}
    println(result)

    /*When the lambda expression has only one parameter,
    * we can use the "it" keyword instead of initialising a variable*/
    program.reverseAndDisplay("Continue") {it.reversed()} // it.reversed() is the alternative of s -> s.reversed()
}

class Program{
    // High-level function with Lambda as parameter.
    fun add(a: Int, b: Int, action: (Int, Int) -> Int){
        val result = action(a, b)
        println(result)
    }

    fun subtract(a: Int, b: Int, action: (Int, Int) -> Unit){
        action(a, b)
    }

    fun reverseAndDisplay(str: String, reverse: (String) -> String){
        val result = reverse(str)
        println(result)
    }
}