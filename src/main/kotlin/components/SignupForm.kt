package components

import kotlinx.html.*
import react.*
import react.dom.*

private val signupForm = functionalComponent<RProps> {
    div("signup-form-wrapper") {
        attrs.id = "email-signup-form"
        div("signup-form-content") {
            div("signup-form-content-left") {
                img {
                    attrs.id = "signup-img"
                    attrs.src = "images/launch_night.svg"
                }
            }
            div("signup-form-content-right") {
                form(action = "/", method = FormMethod.get, classes = "signup-form") {
                    attrs.id = "form"
                    h1 {
                        +"Start your journey today! Create an account to receive purchase details via email."
                    }
                    h5 {
                        +"Availability of flights may vary due to COVID19"
                    }
                    input(type = InputType.text, classes = "signup-input", name = "name") {
                        attrs.id = "name"
                        attrs.placeholder = "Enter your name"
                    }
                    input(type = InputType.email, classes = "signup-input", name = "email") {
                        attrs.id = "email"
                        attrs.placeholder = "Enter your email"
                    }
                    input(type = InputType.password, classes = "signup-input", name = "password") {
                        attrs.id = "password"
                        attrs.placeholder = "Enter your password"
                    }
                    input(type = InputType.password, classes = "signup-input", name = "password") {
                        attrs.id = "password-confirm"
                        attrs.placeholder = "Confirm your password"
                    }
                    input(type = InputType.submit, classes = "signup-input-btn") {
                        attrs.value = "Sign Up"
                    }
                }
            }
            div("signup-form-content-left") {
                img {
                    attrs.id = "signup-img"
                    attrs.src = "images/on_moon.svg"
                }
            }
        }
    }
}

fun RBuilder.signupForm(handler: RProps.() -> Unit) = child(signupForm) {
    attrs {
        handler()
    }
}