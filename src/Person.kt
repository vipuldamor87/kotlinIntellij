class Person(val firstName: String ="peter", val lastName: String = "Parker") {

    var nickName:String? =null
        set(value){
            field = value
            println("the new nickname is $value")
        }
    fun printInfo(){
        val nickNameToPrint = nickName ?:"no nickname" //? is Elvis Operator
        println("$firstName $lastName is $nickNameToPrint")
    }
}