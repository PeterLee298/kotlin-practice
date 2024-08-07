fun main(args: Array<String>) {
    println("Hello World!")
    println(areaOfEllipse(2.0, 3.0))
}

fun areaOfEllipse(vertex: Double, covertex: Double): Double {
    val ellipse = object {
        val x = vertex
        val y = covertex
    }

    return Math.PI * ellipse.x * ellipse.y
}

open class Animal{
    open var name: String = "Animal"
}

class Dog : Animal() {
    override var name: String = "Dog"
}

interface Producer<out T> {
    fun produce(): T
}

class ProducerImpl : Producer<Animal> {
    override fun produce(): Animal {
        TODO("Not yet implemented")
        return Dog()
    }
}
