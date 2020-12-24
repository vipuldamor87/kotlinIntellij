import java.lang.NumberFormatException

fun main(){
    var str: String = "4a"
    var num: Int = 0
    try{
        str.toInt()
    }
    catch(e : NumberFormatException)
    {
        println("give proper input")
    }
    println(num)

}