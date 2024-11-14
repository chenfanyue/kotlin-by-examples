fun main() {

    val listA = listOf("a", "b", "c")                  // 1
    val listB = listOf(1, 2, 3, 4)                     // 1

    val resultPairs = listA zip listB                      // 2
    val resultReduce = listA.zip(listB) { a, b -> "$a$b" } // 3

    println("A to B: $resultPairs")
    println("\$A\$B: $resultReduce")
}