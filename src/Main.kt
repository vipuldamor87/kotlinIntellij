
//top level Variables
var topLevelVar= 12 // Specifying data type not necessary
var notNullVar: String? = null  //using ? to  to use Null values

fun getGreeting(): String{
    return "get Greeting Function called"
}
fun sayHello(): Unit{
    // retun type Unit is similar to void in java
    println("Say hello Function called")
}
fun sayHelloWithPara(itemToGreet: String)
{
    var msg= "saying hello with $itemToGreet"
    println(msg)
}

fun main(){
    val assignOnce: String ="Vipul"
    var canBeAssignedMultipleTimes: String = "Damor"
    println(assignOnce)
    println(canBeAssignedMultipleTimes)
    println(topLevelVar)

    //output using Function
    println(getGreeting())
    sayHello()
    sayHelloWithPara("stringPassed")









   }