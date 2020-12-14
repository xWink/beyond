package pages

import components.cards
import components.heroSection
import react.*
import react.dom.object_

class Home : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        object_ {
            heroSection {}
            cards {}
        }
    }
}