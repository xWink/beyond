package pages

import components.signupForm
import react.*
import react.dom.h1

class SignUp : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        signupForm {}
    }
}