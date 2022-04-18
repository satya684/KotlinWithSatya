/*TODO
*  Used to store same tpe of dataType
*  Fixed size
*  like :- var arr = arrayOf("one", "two", "three")
*  arrays starts from 0th index*/

fun main() {
    var arr = arrayOf("one", "two", "three")
    var arr1 = arrayOf(1, 2, 3)

    var arr2 = arrayOf<Int>(3, 4, 5)
    for ((i, e) in arr.withIndex()) {
        println("$i - $e")
    }
    println(arr[0])
    println(arr[1])
   arr.set(0, "Satya")
   arr.set(2, "Prakash")
    println(arr[0])
    println(arr[2])
    println(arr[1])
    println(arr.size)
}