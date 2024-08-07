import kotlin.reflect.typeOf

fun main(args: Array<String>) {

    // 扩展函数
    fun Number.print() = println("Number is $this")

    fun Int.print() = println("Int is $this")

    val number: Number = 10;

    number.print()



    // 高阶函数
    fun twice(f: (Int) -> Int): (Int) -> Int = {x -> f(f(x))}
    val double: (Int) -> Int = twice {it * 2}
    val plus: (Int) -> Int = twice {it + 1}
    println(double(2))
    println(plus(2))

    val list: IntRange = 1..10
    fun contains(list: IntRange, value: Int): Boolean {
        list.forEach {
            if (it == value) {
                return true
            }
        }
        return false
    }

    println(contains(list, 5))
    println(contains(list, 11))

    // 声明 map 变量// 声明一个名为Person的类
    data class Person(var name: String, var age: Int)

    // 创建Person对象并使用apply函数
    val person = Person("Alice", 30).apply {
        name = "Bob"
        age = 35
    }

    person.apply {
        name = "Bob"
        age = 37
    }

    // 打印person对象的属性
    println(person.name + " " + person.age)

    val essay = with(StringBuilder()) {
        append("The ")
        append("quick ")
        append("brown ")
        append("fox ")
        append("jumps ")
        append("over ")
        append("the ")
        append("lazy ")
        append("dog.")
        toString()
    }
    println(essay)

    val countryToCapital: MutableMap<String, String>? = mutableMapOf(
        "United States" to "Washington, D.C.",
        "Canada" to "Ottawa",
        "Mexico" to "Mexico City",
        "Japan" to "Tokyo",
        "China" to "Beijing",
        "Brazil" to "Brasília",
        "Russia" to "Moscow",
        "India" to "New Delhi",
        "Australia" to "Canberra",
        "South Korea" to "Seoul",
        "United Kingdom" to "London",
        "Italy" to "Rome",
        "Spain" to "Madrid",
        "Netherlands" to "Amsterdam",
        "Sweden" to "Stockholm",
        "Norway" to "Oslo",
        "Denmark" to "Copenhagen",
        "Finland" to "Helsinki",
        "Switzerland" to "Bern",
        "Poland" to "Warsaw",
        "Austria" to "Vienna",
        "Greece" to "Athens",
        "Turkey" to "Ankara",
        "Hungary" to "Budapest",
        "Czech Republic" to "Prague"
    )
    val countries = countryToCapital?.run {
        putIfAbsent("France", "Paris")
        putIfAbsent("Germany", "Berlin")
        keys
    }
    println(countryToCapital)
    println(countries)



    val city = countryToCapital!!.keys.take(1)
    println("Tale 1 : $city")

    val city2 = countryToCapital!!.keys.drop(1)
    println("Drop 1 : $city2")

    val output = countryToCapital!!.keys
        .asSequence()
        .filter { it.startsWith("C") }
        .map {"$it"}
        .joinToString()
    println("City Start With C : $output")

    val output2 = countryToCapital!!.keys.asSequence()
        .filter { it.startsWith("C") }
        .take(2)
        .map { "$it" }
        .joinToString()
    println("Take 2 City Start With C : $output2")

}