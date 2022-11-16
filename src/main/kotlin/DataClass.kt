fun main(){
    val user1 = User("BatFleck", 40)
    val user2 = User("BatFleck", 40)

    println(user1)

    /*Since objects are not created, because we are using data class, we can't have different memory locations.
    * Only Data is Stored, and since the data is same in both the objects.
    * The == operators is returning true*/
    println(user1 == user2)
}

/*A Data Class doesn't create an objects with the values.
* It just holds the data. Mostly used in Models*/
data class User(val name: String, val age: Int)