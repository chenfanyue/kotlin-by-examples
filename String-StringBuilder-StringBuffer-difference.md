在 Kotlin 中，`String`、`StringBuilder` 和 `StringBuffer` 都是用于处理字符串的类，但它们各自有不同的特性和适用场景：

### 1. `String`
- **不可变性**：在 Kotlin 中，`String` 是不可变的，这意味着一旦创建了一个 `String` 对象，它的内容就不能被更改。每当对字符串进行任何修改（如拼接或替换）时，都会创建一个新的 `String` 对象。
- **适用场景**：适用于需要少量字符串操作、只读字符串或不频繁更改字符串内容的情况。
- **性能**：由于 `String` 是不可变的，对于频繁的字符串拼接操作会导致内存开销，因为每次修改都会创建一个新的 `String` 对象。

```kotlin
val str1 = "Hello"
val str2 = str1 + " World"  // 会创建一个新的 String 对象
```

### 2. `StringBuilder`
- **可变性**：`StringBuilder` 是可变的，允许对字符串进行直接修改（如添加、插入、删除字符等）而不会创建新的对象。
- **线程安全性**：`StringBuilder` 不是线程安全的，因此不适合在多线程环境下使用。如果在多线程环境中使用，需要手动同步。
- **适用场景**：适合在单线程环境中进行频繁字符串修改操作，例如构建大型字符串、反复拼接字符串。
- **性能**：因为它是可变的且没有线程同步开销，所以在单线程环境中执行大量字符串操作时，`StringBuilder` 的性能比 `String` 和 `StringBuffer` 更高效。

```kotlin
val builder = StringBuilder("Hello")
builder.append(" World")  // 直接修改原有对象，不创建新对象
```

### 3. `StringBuffer`
- **可变性**：`StringBuffer` 与 `StringBuilder` 类似，也是一个可变的字符串类。
- **线程安全性**：`StringBuffer` 是线程安全的，所有方法都使用了 `synchronized` 来保证多线程的安全性，因此适用于多线程环境。
- **适用场景**：适合在多线程环境中频繁进行字符串操作的情况，例如在需要构建或修改字符串的并发程序中使用。
- **性能**：由于 `StringBuffer` 的方法都是同步的，所以它在单线程环境下性能不如 `StringBuilder`。但在多线程环境中，`StringBuffer` 是更安全的选择。

```kotlin
val buffer = StringBuffer("Hello")
buffer.append(" World")  // 在多线程环境中是线程安全的
```

### 总结
- **`String`**：不可变，适用于只读字符串或少量拼接操作。
- **`StringBuilder`**：可变，非线程安全，适合单线程环境频繁的字符串修改。
- **`StringBuffer`**：可变，线程安全，适合多线程环境频繁的字符串修改。

在单线程中，优先选择 `StringBuilder` 以获得更高性能；在多线程中则使用 `StringBuffer` 来确保线程安全。