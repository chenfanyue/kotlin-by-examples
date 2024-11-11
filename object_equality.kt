import java.util.Random

class LuckDispatcher(private val id: Int) {  // 为每个实例添加一个唯一的 id 属性

    fun getNumber() {
        val objRandom = Random()
        println(objRandom.nextInt(90))
    }

    override fun hashCode(): Int {
        // 使用 id 生成唯一的哈希码，以便符合结构相等性需求
        return id.hashCode()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true  // 引用相等时直接返回 true
        if (other !is LuckDispatcher) return false  // 如果 other 不是 LuckDispatcher 类型，返回 false
        return id == other.id  // 比较 id 是否相等
    }
}

fun main() {
    val d1 = LuckDispatcher(1)   // 创建 LuckDispatcher 实例并指定 id
    val d2 = LuckDispatcher(1)   // 创建另一个 LuckDispatcher 实例，id 相同
    val d3 = LuckDispatcher(2)   // 创建第三个 LuckDispatcher 实例，id 不同

    println(d1 == d2)  // true，因为 id 相同
    println(d1 == d3)  // false，因为 id 不同
}
