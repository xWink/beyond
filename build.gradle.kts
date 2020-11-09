plugins {
    id("org.jetbrains.kotlin.js") version "1.4.10"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    maven("https://kotlin.bintray.com/kotlin-js-wrappers/")
    mavenCentral()
    jcenter()
}

dependencies {
    implementation(kotlin("stdlib-js"))

    // React
    implementation("org.jetbrains:kotlin-react:16.13.1-pre.110-kotlin-1.4.0")
    implementation(npm("react", "16.13.1"))

    // React DOM
    implementation("org.jetbrains:kotlin-react-dom:16.13.1-pre.110-kotlin-1.4.0")
    implementation(npm("react-dom", "16.13.1"))

    // React Router DOM
    implementation("org.jetbrains:kotlin-react-router-dom:5.2.0-pre.129-kotlin-1.4.10")
    implementation(npm("react-router-dom", "5.2.0"))
}

kotlin {
    js {
        browser {
            webpackTask {
                cssSupport.enabled = true
            }

            runTask {
                cssSupport.enabled = true
            }

            testTask {
                useKarma {
                    useChromeHeadless()
                    webpackConfig.cssSupport.enabled = true
                }
            }
        }
        binaries.executable()
    }
}