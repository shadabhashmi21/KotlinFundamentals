fun main(){
    CompanionObjectDemo.increaseCount()
    println(CompanionObjectDemo.count)
}

class CompanionObjectDemo{
    companion object { // All the variables/methods inside the companion object are static
        var count = 0
        fun increaseCount()  = count++
    }
}