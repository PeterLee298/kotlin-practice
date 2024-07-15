fun main(args: Array<String>) {


    val sum2: (Int, Int) -> Int = { a, b -> a + b }
    println(sum2(1, 2))

    val sum = { a: Int, b: Int -> a + b }
    println(sum(1, 2))

    // 隐式参数名 it
    val toUpper: (String) -> String = { it.uppercase() }
    println(toUpper("Hello"))

    // 函数指针
    val toUpper2: (String) -> String = String::uppercase
    println(toUpper2("Hello"))

}