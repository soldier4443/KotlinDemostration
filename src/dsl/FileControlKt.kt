package dsl

import java.io.File

fun main(args: Array<String>) {
    val file = File("/src")

    val br = file.bufferedReader()

    file.useLines {
        println(it)
    }

    println("Android Studio".replaceBefore("Studio", "Visual "))
}