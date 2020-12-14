package pages

import react.*
import react.dom.h1

class Products : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        h1("products") {
            +"PRODUCTS"
        }
    }
}