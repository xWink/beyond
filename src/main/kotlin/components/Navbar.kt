package components

import kotlinx.browser.window
import kotlinx.html.js.onClickFunction
import org.w3c.dom.events.Event
import react.*
import react.dom.*
import react.router.dom.routeLink

private val navbar = functionalComponent<RProps> {
    val (click, setClick) = useState(false)
    val (button, setButton) = useState(true)

    val reverseClick = { setClick(!click) }
    val closeMobileMenu = { setClick(false) }

    val showButton: (Event?) -> Unit = {
        if (window.innerWidth <= 960) {
            setButton(false)
        } else {
            setButton(true)
        }
    }

    useEffect { showButton(null) }

    window.addEventListener("resize", showButton)

    nav("navbar") {
        div("navbar-container") {
            div {
                attrs.onClickFunction = { closeMobileMenu() }
                routeLink("/", className = "navbar-logo") {
                    +"BEYOND"
                    i("fas fa-rocket") {}
                }
            }
            div("menu-icon") {
                attrs.onClickFunction = { reverseClick() }
                i(if (click) "fas fa-times" else "fas fa-bars") {}
            }
            ul(if (click) "nav-menu active" else "nav-menu") {
                li("nav-item") {
                    attrs.onClickFunction = { closeMobileMenu() }
                    routeLink(to = "/", className = "nav-links") {
                        +"Home"
                    }
                }
                li("nav-item") {
                    attrs.onClickFunction = { closeMobileMenu() }
                    routeLink(to = "/services", className = "nav-links") {
                        +"Services"
                    }
                }
                li("nav-item") {
                    attrs.onClickFunction = { closeMobileMenu() }
                    routeLink(to = "/products", className = "nav-links") {
                        +"Products"
                    }
                }
            }
            if (button) {
                routeLink(to = "/sign-up") {
                    buttonComponent {
                        buttonStyle = "btn--outline"
                        buttonSize = "btn--medium"
                        text = "SIGN UP"
                    }
                }
            }
        }
    }
}

fun RBuilder.navbar(handler: RProps.() -> Unit) = child(navbar) {
    attrs {
        handler()
    }
}