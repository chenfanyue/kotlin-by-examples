fun main() {

    val numbers = listOf(1, -2, 3, -4, 5, -6)

    // val firstEven = numbers.first { it % 2 == 0 }
    // 编译器在此处直接展开了 `first` 函数和 lambda 表达式的逻辑
    val firstEven: Int
    run {
        var found = false
        var result: Int? = null

        // 遍历 `numbers` 列表
        for (element in numbers) {
            // 使用内联的 lambda 表达式 `{ it % 2 == 0 }` 作为条件
            if (element % 2 == 0) {
                result = element
                found = true
                break
            }
        }

        if (found) {
            firstEven = result!!
        } else {
            // `first` 在没有匹配项时会抛出 NoSuchElementException
            throw NoSuchElementException("Collection contains no element matching the predicate.")
        }
    }

    println("First even: $firstEven")
}
