fun sayHello(greeting:String,itemToGreet:List<String> ) {
    itemToGreet.forEach{itemToGreet ->
    println("$greeting $itemToGreet")}
}



fun main(){
    val interestingThings= listOf("Kotlin","programming","comic books")
    sayHello("hii",interestingThings)
    //passing param with different order
    sayHello(itemToGreet = interestingThings,greeting = "hii")
}