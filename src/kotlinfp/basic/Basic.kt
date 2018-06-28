package kotlinfp.basic


fun operation() {
    var a = 10
    println(a)

    a += 10
    println(a)
}


fun mutability() {
    // immutable
    val a = 10
    // mutable
    var b = 20

    // Illegal
    // a = 30
    b = 30

    println(a)
    println(b)
}


fun range() {
    for (i in 1..10) {
        // string templates
        print("$i ${i * 2}")
    }

    (1..50).filter { it % 2 == 0 }
        .map { it * 3 }
        .forEach { println(it) }
}


// Function expression
fun sum(x: Int, y: Int) = x + y


class Task(val assignee: Person = Person())
class Person(val interest: Interest = Interest())
class Interest {
    fun doSomething() {

    }
}

fun nullSafety() {

    val task: Task? = null
    task?.assignee?.interest?.doSomething()


    val str: String? = null

    str?.also {
        println(str.length)
        println(str.toUpperCase())
    }

    if (str != null) {
        println(str.length)
        println(str.toUpperCase())
    }
}


// Extension Function
fun String.introduceMySelf() {
    println("I'm " + this)
}


// Extension Function + infix
infix fun String.isSameAs(other: String): Boolean {
    return this == other
}


fun main(args: Array<String>) {
    "Groot".introduceMySelf()
    println("GROOT" isSameAs "Groot".toUpperCase())
}
