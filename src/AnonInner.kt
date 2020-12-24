interface  Human
{
    fun think()
}
fun main(){
    var programmer : Human = object :Human
                        {
                            override fun think() {
                                println("Think Virtually..")

                            }
                        }
    programmer.think()
}