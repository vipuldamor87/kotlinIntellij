fun printFilteredStrings(list: List<String>, predicate: ((String) -> Boolean)?){
    
    list.forEach {
        if(predicate?.invoke(it)== true){
            println(it)
        }
    }
}

val predicate: (String) -> Boolean = {
    it.startsWith("j")
}

fun getPrintPredicate(): (String) -> Boolean{
    return { it.startsWith("j")}
}

fun main() {
    val list = listOf("kotlin", "java", "javascript")
    printFilteredStrings(list,predicate)
    printFilteredStrings(list,getPrintPredicate())
    printFilteredStrings(list,null)

    list
        .filterNotNull()
        .filter{
        it.startsWith("j")
    }

        .take(1)
        .forEach {
        println(it)
    }

    val language = list.first() // also use find{ it.startsWith("j")}
    println(language)
}
    

