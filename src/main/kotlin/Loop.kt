fun main(){

    //Equivalent to for(i = 1; i<=10; i++)
    for (i in 1..10)
        print("$i ")
    println()

    //Equivalent to for(i = 1; i<10; i++)
    for (i in 1 until 10)
        print("$i ")
    println()

    //Equivalent to for(i = 10; i>=1; i++)
    for (i in 10 downTo 1)
        print("$i ")
    println()

    //Equivalent to for(i = 1; i<=10; i=1+2)
    for (i in 1..10 step 2)
        print("$i ")
}