//TODO
//    var can be reassigned.
//    val can not be reassigned;

fun  main(){
    var number  = 35
    number = 40 //TODO It is reassigned
    println(number)

    var  UName = "Kolin"
    var MName = "Test"
    UName = MName
    println(UName)

    val name = "Satya"
  //  name = "Praskash" //TODO It is showing error beacause val can not reassigned
    println(name)

}