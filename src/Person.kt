class Person(val firstName: String ="peter", val lastName: String = "Parker") {

    var nickName:String? =null
        set(value){
            field = value
            println("the new nickname is $value")
        }
    fun printInfo(){
        println("$firstName $lastName is $nickName")
    }
}