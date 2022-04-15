/*TODO the readability is very good of When statement
*   how to use when*/

fun main() {
    val animal: String = "dog"
    /*if (animal == "cat") println("cat") else if(animal == "Horse") println("horse") else if (animal == "dog") println("dog")
    else ("Animal not found")

    TODO here in the above code we are using if else condition to find a animal the same work we can do with the help of When statement
        basiclly When is work as a Switch statement
*/
   val output = when (animal) {
        /*"dog" -> println("dog")
        "horse" -> println("horse")
        "cat" -> println("cat")
        else -> println("animal not found")*/
       //TODO using when statement as an expression
       "dog" -> "dog"
       "horse" -> "horse"
       "cat" -> "cat"
       else -> "animal not found"
    }
    println(output)
}