fun sayHello(greeting:String,itemToGreet:List<String> ) {
    itemToGreet.forEach{itemToGreet ->
    println("$greeting $itemToGreet")}
}

//Function with default param
fun greetPerson(greeting: String="hello",name: String = "kotlin") = println("$greeting $name")

fun main(){
   val person = Person()
    person.lastName
    person.firstName
    person.nickName = "Spiderman"
    person.printInfo()
}