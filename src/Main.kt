
//top level Variables
var topLevelVar= 12 // Specifying data type not necessary
var notNullVar: String? = null  //using ? to  to use Null values

fun main(){
    val assignOnce: String ="Vipul"
    var canBeAssignedMultipleTimes: String = "Damor"
    println(assignOnce)
    println(canBeAssignedMultipleTimes)
    println(topLevelVar)

    when(notNullVar){
        null -> println("Hi it was null")
        else -> println(notNullVar)
    }
    when(topLevelVar) {
       in  1..3 -> println("It is between 1 and 3")
       in  4..5 -> println("it is between 4 and 5")
        in 6..12 -> println("it is between 6 and 12")
        else -> println("not under the range")
    }

   }