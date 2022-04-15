/*TODO
*  Foor Loop
*  Range(.., until, step, downTo)
*  step --> means increase range by 1,2,3,4
*  Example below
*  DownTo --> means print reverse*/

fun main(){
    for (i in 1..10 step 2)
        println(i)

    println("Until start")

    for (i in 1 until 10)
        println(i)

    println("DOWN TO START")
        for (i in 10 downTo 1)
            println(i)

    println("DOWN TO START Using step")
    for (i in 10 downTo 1 step 2)
        println(i)
}