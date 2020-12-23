fun sayHello(greeting:String,itemToGreet:List<String> ) {
    itemToGreet.forEach{itemToGreet ->
    println("$greeting $itemToGreet")}
}

//Function with default param
fun greetPerson(greeting: String="hello",name: String = "kotlin") = println("$greeting $name")

fun main(){
    val interestingThings= listOf("Kotlin","programming","comic books")
    sayHello("hii",interestingThings)
    //passing param with different order
    sayHello(itemToGreet = interestingThings,greeting = "hii")

    //if we don't pass any value in greetPerson FUN it will use default Param
    greetPerson()
    greetPerson(name="vipul")
}