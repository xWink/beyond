package components

import react.RBuilder
import react.RProps
import react.child
import react.dom.*
import react.functionalComponent
import react.router.dom.routeLink

interface CardItemProps : RProps {
    var path: String
    var src: String
    var text: String
    var label: String
}

private val cardItem = functionalComponent<CardItemProps> { props ->
    li("cards__item") {
        routeLink(to = props.path, className = "cards__item__link") {
            figure("cards__item__pic-wrap") {
                attrs["data-category"] = props.label
                img(src = props.src, alt = "Travel Image", classes = "cards__item__img") {}
            }
            div("cards__item__info") {
                h5("cards__item__text") { +props.text }
            }
        }
    }
}

fun RBuilder.cardItem(handler: CardItemProps.() -> Unit) = child(cardItem) {
    attrs {
        handler()
    }
}