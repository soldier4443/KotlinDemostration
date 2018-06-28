package kotlinfp.basic

interface Eatable {
    fun eat()
}

abstract class Fruit : Eatable

class Apple : Fruit() {
    override fun eat() {
        println("사과를 먹었다.")
    }
}

class Rice : Eatable {
    override fun eat() {
        println("밥을 먹었다.")
    }
}