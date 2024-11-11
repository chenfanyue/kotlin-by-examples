sealed class Mammal(val name: String)                                                   // 1

class Cat(catName: String) : Mammal(catName)                                        // 2
class Human(humanName: String, val job: String) : Mammal(humanName)

fun greetMammal(mammal: Mammal): String {
    return when (mammal) {                                                                     // 3
        is Human -> "Hello ${mammal.name}; You're working as a ${mammal.job}"    // 4
        is Cat -> "Hello ${mammal.name}"                                         // 5
    }                                                                                   // 6
}
fun main() {
    println(greetMammal(Cat("Snowy")))
}