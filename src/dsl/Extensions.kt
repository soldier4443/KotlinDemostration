package dsl

import java.text.SimpleDateFormat
import java.util.*

fun Date.toFormattedString(): String = SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(this)

fun String.toDate(): Date = SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(this)


fun main(args: Array<String>) {
    val date = Date()

    val formatted = date.toFormattedString()
    val newDate = formatted.toDate()
}