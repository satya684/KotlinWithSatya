/*TODO
*  Same name nut different parameter
*  Example Below*/

fun main(){
    var sum = addition(10, 10)
    var sum1 = addition(2211122.112,15564644.2)
    println(sum)
    println(sum1)
}
fun addition(a : Int, b : Int):Int{
   return a * b
}

fun addition(a : Double, b:Double): Double{
    return a + b
}