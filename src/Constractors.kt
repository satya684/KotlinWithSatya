/*TODO
*  need of constractor :- to provide the default values to the object's properties*/

fun main() {
    var car = AutoMobile("Car", 4, 5)
    var person2 = Person1("Shyam", 8)
    println(person2.age)
    println(person2.name)
}

class AutoMobile(val name: String, val type: Int, val maxSeating: Int) {
    fun drive() {}
    fun applyBreaks() {}
}

class Person1(personName: String, personAge: Int) {
    val name: String = personName
    val age: Int = personAge
}