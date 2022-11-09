fun main(){
    var place: String? = "New York"
    place = null

    //?: Elvis Operator
    var area = place ?: "Manhattan"
    //The above code is equivalent to the below given if-else
    if (place != null)
        area = place
    else
        area = "Manhattan"

    println(area)
}