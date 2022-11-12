fun main() {
    volume(breadth = 2, length = 5)
}

//height is the default parameter here
fun volume(length: Int, breadth: Int, height: Int = 10) {
    println("Length is $length")
    println("Breadth is $breadth")
    println("Height is $height")
}