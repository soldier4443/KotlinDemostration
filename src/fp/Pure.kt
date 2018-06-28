package fp

var globalCounter: Int = 0

fun addCounter() {
    globalCounter++
}

fun sum(x: Int, y: Int) = x + y

fun main(args: Array<String>) {
    addCounter()
    sum(1, 3)
}

