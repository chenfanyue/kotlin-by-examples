data class Item(val name: String, val price: Float)                                         // 1

data class Order(val items: Collection<Item>)

val Order.commaDelimitedItemNames: String
    get() {
        println("Processing item names...")
        // 假设有一些复杂的处理逻辑
        val processedNames = items.map { it.name.uppercase() }
        println("Processed names: $processedNames")

        return processedNames.joinToString(", ")
    }
