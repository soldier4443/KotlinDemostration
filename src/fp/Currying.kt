package fp

class Context

class Drawable

fun getDrawable(context: Context, drawableId: Int): Drawable {
    return Drawable()
}

fun getDrawable(context: Context): (Int) -> Drawable {
    return { drawableId ->
        Drawable()
    }
}

fun main(args: Array<String>) {
    val context = Context()

    getDrawable(context, 13)


    // Curried functions..
    getDrawable(context)(32)

    val drawableWithId = getDrawable(context)

    drawableWithId(14)
    drawableWithId(72)
    drawableWithId(58)
}