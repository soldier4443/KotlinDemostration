package diff


fun doSomething(list: List<Int>): List<Int> {
    val ret: MutableList<Int> = mutableListOf()
    for (i in list) {
        ret.add(i + 1)
    }
    return ret
}


fun doSomethingSimple(list: List<Int>): List<Int> {
    return list.map { it + 1 }
}