/*TODO
*  functions are block of codes
*  helps us to resue the code */
fun main(){
    val output = add(5 , 5)
    println(output)
    var sTest = test("Satya", "\tPraksh")
    println(sTest)
    val  sumT = math();
    println(sumT)
}
fun add(number : Int , number2 :Int): Int {
    val sum = number + number2
    return sum
}
fun test(name: String, name2 : String):String{
    val tName = name + name2
    return tName
}
fun math(){
    val tSum = 2 + 10
    println(tSum)
}