import java.util.Random

class LuckDispatcher {                    //1
    fun getNumber() {                     //2
        val objRandom = Random()
        println(objRandom.nextInt(90))
    }

    override fun hashCode(): Int {
        return javaClass.hashCode()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false
        return true
    }
}

fun main() {
    val d1 = LuckDispatcher()             //3
    val d2 = LuckDispatcher()
    println(d1 == d2)
}
