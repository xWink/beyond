package components

import react.RBuilder
import react.RProps
import react.child
import react.dom.div
import react.dom.h1
import react.dom.ul
import react.functionalComponent

private val cards = functionalComponent<RProps> {
    div("cards") {
        h1 { +"Go to these LIFE CHANGING destinations!" }
        div("cards__container") {
            div("cards__wrapper") {
                ul("cards__items") {
                    cardItem {
                        src = "images/earth_from_moon.webp" // https://www.livescience.com/65831-earth-phases-from-moon.html
                        text = "Watch Earth rise over the moon's horizon"
                        path = "/sign-up"
                        label = "Adventure"
                    }
                    cardItem {
                        src = "images/mars_selfie_big.jpg" // http://spacetimes.in/5-must-visit-places-for-future-martian-tourists/
                        text = "Travel through the mountain ranges of Mars"
                        path = "/sign-up"
                        label = "Exploration"
                    }
                }
                ul("cards__items") {
                    cardItem {
                        src = "images/roadster_orbit.png" // https://www.whereisroadster.com/
                        text = "Drive around Earth's orbit inside your own vehicle"
                        path = "/sign-up"
                        label = "Thrilling"
                    }
                    cardItem {
                        src = "images/space_hotel.jpg" // https://www.cntraveler.com/story/what-spending-a-night-at-a-space-hotel-looks-like
                        text = "Relax in an all-inclusive space resort"
                        path = "/sign-up"
                        label = "Luxurious"
                    }
                    cardItem {
                        src = "images/space_walk.jpg" // https://www.forbes.com/sites/quora/2017/03/16/how-do-astronauts-eat-during-a-spacewalk/?sh=76e3229846eb
                        text = "Experience zero gravity with a space walk"
                        path = "/sign-up"
                        label = "Sensational"
                    }
                }
            }
        }
    }
}

fun RBuilder.cards(handler: RProps.() -> Unit) = child(cards) {
    attrs {
        handler()
    }
}