/*TODO
*  We can create our own dataType
* */
fun main() {
    var i: Int = 20

    println(i.plus(30))
    println(i.toFloat())

    val p1 = Person("P1",21 )
    val p2 = Person("P2",17)

    println(p1.canVote())

    println(p2.canVote())

    p2.age = 22
    println(p2.canVote())

}
class Person(val name :String,var age : Int){
    fun canVote() : Boolean{
        return  age > 18
    }
}