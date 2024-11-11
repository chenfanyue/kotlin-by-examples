class Person {
    var age: Int = 0
        set(value) {
            field = if (value >= 0) value else 0  // 如果传入负值，则设置为 0
        }
}

fun main() {
    val person = Person()
    person.age = 25
    println("Age: ${person.age}")  // 输出：Age: 25

    person.age = -5
    println("Age: ${person.age}")  // 输出：Age: 0
}
