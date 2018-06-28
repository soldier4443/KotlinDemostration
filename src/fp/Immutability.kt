package fp

fun mutablilty() {
    val a = 50
    var b = 50

//    a = 30
    b = 30

    println(a)
    println(b)


    val list = listOf<Int>()
    val mutableList = mutableListOf<Int>()

    // List - add is not supported
    // list.add(10)
    mutableList.add(10)
}