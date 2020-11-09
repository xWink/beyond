import components.app
import react.dom.*
import kotlinx.browser.*

fun main() {
    render(document.getElementById("root")) {
        app {}
    }
}