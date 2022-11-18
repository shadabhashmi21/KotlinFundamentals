fun main(){
    val program = Program()

    //Lambda expression
    val lambda: (Int, Int) -> Int = {x: Int, y: Int -> x + y} // The last expression "x + y" is the method body
    program.add(5,10, lambda)

    //Alternative approach, without using a variable
    program.add(10, 12) { x, y -> x + y }
    //program.add(10, 12, { x, y -> x + y }) // Outdated approach
}

class Program{
    // High-level function with Lambda as parameter.
    fun add(a: Int, b: Int, action: (Int, Int) -> Int){
        val result = action(a, b)
        println(result)
    }
}