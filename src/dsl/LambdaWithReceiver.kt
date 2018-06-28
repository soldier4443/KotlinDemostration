package dsl

abstract class View(var width: String = "wrap_content",
                    var height: String = "wrap_content")

abstract class ViewGroup : View() {
    val children = mutableListOf<View>()
}


class LinearLayout : ViewGroup()

class TextView(var textSize: String = "11dp",
               var text: String = "") : View()


fun linearLayout(f: LinearLayout.() -> Unit) = LinearLayout().also(f)

fun ViewGroup.textView(f: TextView.() -> Unit) {
    children.add(TextView().also(f))
}


fun main(args: Array<String>) {
    linearLayout {
        width = "match_parent"
        height = "wrap_content"
        textView {
            textSize = "16dp"
            text = "Android"
        }
    }
    // https://github.com/Kotlin/anko
}
