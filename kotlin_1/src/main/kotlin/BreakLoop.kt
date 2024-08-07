fun main(args: Array<String>) {

    println("run breakForLoop()")
    breakForLoop()

    println("run returnForLoop()")
    returnForLoop()

    println("run breakForEachLoop()")
    breakForEachLoop()

    println("run breakWhileLoop()")
    breakWhileLoop()

    println("run breakDoWhileLoop()")
    breakDoWhileLoop()

    println("run breakDoubleLoop()")
    breakDoubleLoop()

}

fun breakForLoop() {
    val map = mapOf("a" to 1, "b" to 2, "c" to 3)
    for ((key, value) in map) {
        if (key == "b") {
            break // 跳出循环
        }
        println("$key -> $value")
    }
}

fun returnForLoop() {
    val map = mapOf("a" to 1, "b" to 2, "c" to 3)
    for ((key, value) in map) {
        if (key == "b") {
            return  // 方法返回
        }
        println("$key -> $value")
    }
}

fun breakForEachLoop() {
    val map = mapOf("a" to 1, "b" to 2, "c" to 3)

    // 创建一个标签为loop的作用域
    run loop@ {
        println("run loop@")
        map.forEach {
            if (it.key == "b") {
                return@loop // 退出作用域
            }
            println("${it.key} -> ${it.value}")
        }
    }

    // 使用了一个隐式标签 @forEach，指代了 map.forEach 这个闭包。
    println("return @forEach")
    map.forEach() {
        if (it.key == "b") {
            return@forEach // 退出闭包
        }
        println("${it.key} -> ${it.value}")
    }
}

fun breakWhileLoop() {
    val map = mapOf("a" to 1, "b" to 2, "c" to 3)
    var i = 0
    while (i < map.size) {
        // 比较map的key
        if (map.keys.elementAt(i) == "b") {
            break
        }
        println("${map.keys.elementAt(i)} -> ${map.values.elementAt(i)}")
        i++
    }
}

fun breakDoWhileLoop() {
    val map = mapOf("a" to 1, "b" to 2, "c" to 3)
    var i = 0
    do {
        // 比较map的key
        if (map.keys.elementAt(i) == "b") {
            break
        }
        println("${map.keys.elementAt(i)} -> ${map.values.elementAt(i)}")
        i++
    } while (i < map.size)
}

fun breakDoubleLoop() {
    outer@ for (i in 1..3) {
        inner@ for (j in 1..3) {
            if (i == 2 && j == 2) {
                break@outer
            }
            println("$i, $j")
        }
    }
}


