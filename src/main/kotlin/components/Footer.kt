package components

import components.buttonComponent
import kotlinx.html.InputType
import react.RBuilder
import react.RProps
import react.child
import react.dom.*
import react.functionalComponent
import react.router.dom.routeLink

private val footer = functionalComponent<RProps> {
    div("footer-container") {
        section("footer-subscription") {
            p("footer-subscription-heading") {
                +"Join the Beyond newsletter to receive our best deals"
            }
            p("footer-subscription-text") {
                +"You can unsubscribe at any time."
            }
            div("input-areas") {
                form {
                    input(classes = "footer-input", name = "email", type = InputType.email) {
                        attrs.placeholder = "Your Email"
                    }
                    buttonComponent {
                        buttonStyle = "btn--outline"
                        buttonSize = "btn--medium"
                        onClick = {}
                        text = "Subscribe"
                    }
                }
            }
        }
        div("footer-links") {
            div("footer-link-wrapper") {
                div("footer-link-items") {
                    h2 { +"About Us" }
                    routeLink(to = "/") { +"How it works" }
                    routeLink(to = "/") { +"Testimonials" }
                    routeLink(to = "/") { +"Careers" }
                    routeLink(to = "/") { +"Investors" }
                    routeLink(to = "/") { +"Terms of Service" }
                }
                div("footer-link-items") {
                    h2 { +"Contact Us" }
                    routeLink(to = "/") { +"Contact" }
                    routeLink(to = "/") { +"Support" }
                    routeLink(to = "/") { +"Destinations" }
                    routeLink(to = "/") { +"Sponsorships" }
                }
            }
            div("footer-link-wrapper") {
                div("footer-link-items") {
                    h2 { +"Videos" }
                    routeLink(to = "/") { +"Submit Video" }
                    routeLink(to = "/") { +"Ambassadors" }
                    routeLink(to = "/") { +"Agency" }
                    routeLink(to = "/") { +"Influencer" }
                }
                div("footer-link-items") {
                    h2 { +"Social Media" }
                    routeLink(to = "/") { +"Instagram" }
                    routeLink(to = "/") { +"Facebook" }
                    routeLink(to = "/") { +"Youtube" }
                    routeLink(to = "/") { +"Twitter" }
                }
            }
        }
        section("social-media") {
            div("social-media-wrap") {
                div("footer-logo") {
                    routeLink(to = "/", className = "social-logo") {
                        +"BEYOND"
                        i("fas fa-rocket") {}
                    }
                }
                small("website-rights") { +"BEYOND © 2020" }
                div("social-icons") {
                    routeLink(to = "/", className = "social-icon-link facebook") {
                        i("fab fa-facebook-f") {}
                    }
                    routeLink(to = "/", className = "social-icon-link instagram") {
                        i("fab fa-instagram") {}
                    }
                    routeLink(to = "/", className = "social-icon-link youtube") {
                        i("fab fa-youtube") {}
                    }
                    routeLink(to = "/", className = "social-icon-link twitter") {
                        i("fab fa-twitter") {}
                    }
                    routeLink(to = "/", className = "social-icon-link linkedin") {
                        i("fab fa-linkedin") {}
                    }
                }
            }
        }
    }
}

fun RBuilder.footer(handler: RProps.() -> Unit) = child(footer) {
    attrs {
        handler()
    }
}