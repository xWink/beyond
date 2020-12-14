package components

import react.*
import react.dom.div

interface ListingProps : RProps {
    var title: String?
    var description: String?
    var price: String?
    var imgSrc: String?
}

private val listing = functionalComponent<ListingProps> { props ->
    div("listing") {
        div("listing-title") {
            +(props.title ?: "")
        }
        div("listing-price") {
            +(props.price ?: "")
        }
        div("listing-description") {
            +(props.description ?: "")
        }
    }
}

fun RBuilder.listing(handler: ListingProps.() -> Unit) = child(listing) {
    attrs {
        handler()
    }
}