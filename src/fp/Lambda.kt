package fp

import java.util.concurrent.ThreadLocalRandom

fun lazyPrinter(writer: () -> String) {
    println(writer())
}

fun randomPrinter(consumer: (Int) -> String) {
    val rand = generateRandom()
    println(consumer.invoke(rand))
}

fun generateRandom() = ThreadLocalRandom.current().nextInt(0, 100)

fun adder(base: Int): (Int) -> Int = { it ->
    base + it
}

fun multiplier(base: Int): (Int) -> Int {
    return { it -> base * it }
}


fun main(args: Array<String>) {
    // Anonymous Function
    lazyPrinter({ "Android" })

    // Lambda expression
    lazyPrinter { "Android" }

    randomPrinter { randomInt ->
        "Value is $randomInt"
    }

    randomPrinter { randomInt ->
        "I have $randomInt bananas"
    }

    val myAdder = adder(3)
    println(myAdder(5))
    println(myAdder(2))
}