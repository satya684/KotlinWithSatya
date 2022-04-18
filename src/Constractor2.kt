/*TODO
*  */

fun main(){
    val name = Person3("Sam", 22)
    println(name.name)
    println(name.age)

}
class Person3(personName : String, personAge : Int){
    val name : String = personName
    val age : Int = personAge

}