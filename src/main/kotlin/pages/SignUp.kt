package pages

import react.*
import react.dom.h1

class SignUp : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        h1("sign-up") {
            +"LIKE & SUBSCRIBE"
        }
    }
}

fun RBuilder.signUp(handler: RProps.() -> Unit) = child(SignUp::class) {
    attrs {
        handler()
    }
}