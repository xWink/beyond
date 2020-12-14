package components

import kotlinx.browser.window
import kotlinx.html.*
import kotlinx.html.js.onChangeFunction
import kotlinx.html.js.onClickFunction
import kotlinx.html.js.onSubmitFunction
import org.w3c.dom.HTMLInputElement
import react.*
import react.dom.*

private val signupForm = functionalComponent<RProps> {
    val (name, setName) = useState("")
    val (email, setEmail) = useState("")
    val (password, setPassword) = useState("")
    val (passwordConfirm, setPasswordConfirm) = useState("")

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
                    h1 {
                        +"Start your journey today! Create an account to receive purchase details via email."
                    }
                    h5 {
                        +"Availability of flights may vary due to COVID19"
                    }
                    input(type = InputType.text, classes = "signup-input", name = "name") {
                        attrs.id = "name"
                        attrs.placeholder = "Enter your name"
                        attrs.required = true
                        attrs.onChangeFunction = {
                            val target = it.target as HTMLInputElement
                            setName(target.value)
                        }
                    }
                    input(type = InputType.email, classes = "signup-input", name = "email") {
                        attrs.placeholder = "Enter your email"
                        attrs.required = true
                        attrs.onChangeFunction = {
                            val target = it.target as HTMLInputElement
                            setEmail(target.value)
                        }
                    }
                    input(type = InputType.password, classes = "signup-input", name = "password") {
                        attrs.placeholder = "Enter your password"
                        attrs.required = true
                        attrs.onChangeFunction = {
                            val target = it.target as HTMLInputElement
                            setPassword(target.value)
                        }
                    }
                    input(type = InputType.password, classes = "signup-input", name = "password-confirm") {
                        attrs.placeholder = "Confirm your password"
                        attrs.required = true
                        attrs.onChangeFunction = {
                            val target = it.target as HTMLInputElement
                            setPasswordConfirm(target.value)
                        }
                    }
                    input(type = InputType.submit, classes = "signup-input-btn") {
                        attrs.value = "Sign Up"
                    }
                    attrs.onSubmitFunction = {
                        if (!passwordsMatch(password, passwordConfirm)) {
                            window.alert("Password does not match password confirmation")
                            it.preventDefault()
                        } else {
                            window.alert("Thank you for signing up! You will receive an email with purchase details soon.")
                        }
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

private fun passwordsMatch(string1: String, string2: String): Boolean = string1 == string2

fun RBuilder.signupForm(handler: RProps.() -> Unit) = child(signupForm) {
    attrs {
        handler()
    }
}