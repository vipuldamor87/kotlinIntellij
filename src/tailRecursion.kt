import java.math.BigInteger

fun main(){
    var number= BigInteger("7000")
    println(fact(number, BigInteger.ONE))
}


tailrec fun fact(num : BigInteger , result : BigInteger ) : BigInteger{
   if (num == BigInteger.ZERO){
       return result
   }
    else{
       return fact(num- BigInteger.ONE, num*result)
    }
}