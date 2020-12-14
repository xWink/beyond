package components

import react.*
import react.dom.*
import react.router.dom.routeLink

private val heroSection = functionalComponent<RProps> {
    div("hero-container") {
        video("back-vid") {
            attrs.src = "videos/space_cropped.mp4"
            attrs.autoPlay = true
            attrs.loop = true
            attrs["muted"] = true
        }
        h1 {
            +"ADVENTURE AWAITS"
        }
        p {
            +"What are you waiting for?"
        }
        div("hero-btns") {
            routeLink(to = "/sign-up") {
                buttonComponent {
                    classes = "btns"
                    buttonStyle = "btn--outline"
                    buttonSize = "btn--large"
                    onClick = { console.log("Get Started") }
                    text = "GET STARTED"
                }
            }
            buttonComponent {
                classes += "btns"
                buttonStyle = "btn--primary"
                buttonSize = "btn--large"
                onClick = { console.log("Watch Trailer") }
                text = "WATCH TRAILER"
            }
        }
    }
}

fun RBuilder.heroSection(handler: RProps.() -> Unit) = child(heroSection) {
    attrs {
        handler()
    }
}