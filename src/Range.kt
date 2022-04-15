/*TODO
*  Today we are going to learn about range in kotlin
*  Range (.. & until)
*  1..5 = 1,2,3,4,5 this is then meaning of range
*  1 until 5 = 1,2,3,4 and this is the meaning if until in kotlin*/

fun main(){
    /*Todo we are going to check are the number 10 lies un the range of 1..5*/
    val n : Int = 3;/*todo we ll get answer as false because 10 not lies in the rage of
                        1..5 so we gonna change the number 10 to 3*/
    val result = n in 1..5
    println(result)

    var number : Int = 10
    var number1 = number in 1 until 10
    println(number1)
}

