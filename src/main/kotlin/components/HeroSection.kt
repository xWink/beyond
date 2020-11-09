package components

import kotlinx.html.classes
import react.*
import react.dom.*

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
            buttonComponent {
                attrs.classes += "btns"
                buttonStyle = "btn--outline"
                buttonSize = "btn--large"
                onClick = { console.log("Get Started") }
                text = "GET STARTED"
            }
            buttonComponent {
                attrs.classes += "btns"
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