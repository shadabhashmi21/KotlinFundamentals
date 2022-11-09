fun main(){
    var name: String = "John"
    //name = null -> We can't assign null here because the value name is not nullable

    var nullableName: String? = "Smith"
    //nullableName = null // We can assign null here because the value is nullable

    var len1 = name.length
    var len2 = nullableName?.length
    //The above code is equivalent to the below given if-else
    if (nullableName != null)
        len2 = nullableName.length
    else
        len2 = null

    //If we want to execute a block of code only if a given variable is not null then we use let operator
    nullableName?.let {
        println(it.length)
    }
}