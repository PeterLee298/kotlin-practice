fun main(args: Array<String>) {

    // 变量 var variable 常量 val value
    var mercury: String = "Mercury"
//    val mercury: String = "Mercury"
    mercury = "Venus"

    println(mercury)

    // 类型推断
    var venus =  "Venus"
    var age = 100;
    println(venus + " is " + age + " years old")

    // 条件表达式
    val name = if (mercury == "Mercury") {
        "Mercury"
    } else {
        "Venus"
    }

    println("name is : $name")

    val len = name?.length ?: 0
    println("name length is : $len")

    val name2: String? = null
    // 安全调用运算符
    val len2 = name2?.length ?: 0
    println("name2 length is : $len2")

    // 可空类型 必须使用 ?. 或者 !!， 否则编译报错
//    val len3 = name2.length

    // 非安全调用运算符， 强制将可空类型转换为非空类型
    // 明确对象不为空，可以使用!!
    val len4 = name!!.length
    println("name4 length is : $len4")

//    val len4 = name2!!.length
    // Exception in thread "main" java.lang.NullPointerException at VariableKt.main(Variable.kt:31)

}