fun main(){
    var a1 = Alien()
    a1.skills = "java"
    a1.show()

    var a2 = Alien()
    a2.skills = "sql"
    a2.show()

    var a3 = a1.plus(a2)
    a3.show()
    var a4 = a1 plus2 a2
    a4.show()
}

fun Alien.plus(a : Alien) : Alien
{
    var newAlien = Alien()
    newAlien.skills = this.skills + " " + a.skills
    return newAlien
}

infix fun  Alien.plus2(a: Alien) : Alien
{
    var newAlien = Alien()
    newAlien.skills = this.skills + " " + a.skills
    return newAlien
}

