fun main(){
    val season = 0;

    when(season){
        1 -> println("Spring")
        2 -> println("Summer")
        3 -> {
            println("Autumn")
            println("Fall")
        }
        4 -> println("Winter")
        else -> println("Invalid season")
    }

    val month = 12

    when(month){
        in 3..5 -> println("Spring")
        in 6..8 -> println("Summer")
        in 9..11 -> println("Fall")
        12,1,2 -> println("Winter")
    }

    val x : Any = 13.37f
    when(x){
        is Int -> println("Integer")
        is Double -> println("Double")
        is String -> println("String")
        !is Boolean -> println("Not Boolean")
        else -> println("Invalid")
    }
}