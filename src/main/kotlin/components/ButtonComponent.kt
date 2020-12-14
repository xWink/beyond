package components

import kotlinx.html.ButtonType
import kotlinx.html.classes
import kotlinx.html.js.onClickFunction
import org.w3c.dom.events.Event
import react.RBuilder
import react.RProps
import react.child
import react.dom.button
import react.functionalComponent

interface ButtonComponentProps : RProps {
    var onClick: (Event) -> Unit
    var buttonStyle: String?
    var buttonSize: String?
    var text: String?
    var classes: String?
}

private val buttonComponent = functionalComponent<ButtonComponentProps> { props ->
    button {
        attrs.classes += "btn"
        attrs.classes += "btn-mobile"
        attrs.classes += props.buttonStyle ?: ""
        attrs.classes += props.buttonSize ?: ""
        attrs.classes += props.classes ?: ""
        attrs.onClickFunction = props.onClick
        attrs.type = ButtonType.button
        +(props.text ?: "")
    }
}

fun RBuilder.buttonComponent(handler: ButtonComponentProps.() -> Unit) = child(buttonComponent) {
    attrs {
        handler()
    }
}