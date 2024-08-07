import kotlinx.coroutines.*

fun main(args: Array<String>) {
    runBlocking {
        launch /*(start = CoroutineStart.UNDISPATCHED)*/{
            println("Before calling doSomething()")
            doSomething()
            println("After calling doSomething()")
        }
        println("Hello World")

        delay(1000 * 5)
        println("Hello World 2")
    }
}

suspend fun doSomething() {
    println("Start doing something...")
    for (i in 1..10) {
        println("Doing something... $i")
        delay(1000)
    }
    println("Done doing something!")
}