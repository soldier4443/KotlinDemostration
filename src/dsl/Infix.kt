package dsl

infix fun <T> T.shouldBe(other: T) = this == other

fun String.isGroot() = (this.toUpperCase() shouldBe "GROOT") and (this.toLowerCase() shouldBe "groot")

fun main(args: Array<String>) {
    println("grooT".isGroot())
}
