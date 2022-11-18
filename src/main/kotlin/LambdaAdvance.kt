fun main(){
    val candidate = Candidate()

    // Traditional way of setting object properties
    candidate.name = "John"
    candidate.age = 22

    // Lambda method
    with(candidate){
        name = "Constantine"
        age = 30
    }

    candidate.apply{
        name = "Victor Creed"
        age = 40
    }.ready() // the object's method call can be down only using "apply", not using with
}

class Candidate{
    var name = ""
    var age = 0

    fun ready() = println("Candidate is ready")
}