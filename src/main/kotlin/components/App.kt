package components

import pages.Home
import pages.Products
import pages.Services
import pages.SignUp
import react.*
import react.router.dom.browserRouter
import react.router.dom.route
import react.router.dom.switch

class App : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        browserRouter {
            navbar {}
            switch {
                route(exact = true, path = "/", component = Home::class)
                route(path = "/services", component = Services::class)
                route(path = "/products", component = Products::class)
                route(path = "/sign-up", component = SignUp::class)
            }
            footer {}
        }
    }
}

fun RBuilder.app(handler: RProps.() -> Unit): ReactElement {
    return child(App::class) {
        this.attrs(handler)
    }
}
