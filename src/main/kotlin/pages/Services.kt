package pages

import react.*
import react.dom.h1

class Services : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        h1("services") {
            +"SERVICES"
        }
    }
}