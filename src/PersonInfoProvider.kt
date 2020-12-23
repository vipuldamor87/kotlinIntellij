interface PersonInfoProvider {
    val providerInfo : String
    fun printInfo(person: Person){
        println(providerInfo)
        person.printInfo()
    }
}

interface  SessionInfoProvider{
    fun getSessionId() : String
}

class BasicInfoProvider : PersonInfoProvider,SessionInfoProvider {
    override val providerInfo: String
        get() = "BasicInfoProvider"

    override fun printInfo(person: Person) {
        super.printInfo(person)
        println("additonal print statement")
    }

    override fun getSessionId(): String {
        return "Session"
    }
}

fun checkTypes(infoProvider: PersonInfoProvider){
    if(infoProvider is SessionInfoProvider){
        println("is a session info provider")
    } else {
        println("not a session info provider")
    }
}

fun main(){
    val provider = BasicInfoProvider()
    provider.printInfo(Person())
    provider.getSessionId()
    checkTypes(provider)
}