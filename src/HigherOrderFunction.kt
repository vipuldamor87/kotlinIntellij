fun printFilteredStrings(list: List<String>, predicate: ((String) -> Boolean)?){
    
    list.forEach {
        if(predicate?.invoke(it)== true){
            println(it)
        }

    }

}
fun main() {
    val list = listOf("kotlin", "java", "javascript")
    printFilteredStrings(list) {
        it.startsWith("j")
    }
}
    

