buildTargets = setOf(BuildTarget.Android, BuildTarget.Js)

setupMultiplatform()

kotlin {
    sourceSets {
        commonMain {
            dependencies {
                implementation(project(":mvikotlin"))
                implementation(project(":mvikotlin-extensions-coroutines"))
                api(project(":sample:todo-common"))
                implementation(project(":sample:todo-common-internal"))
                implementation(Deps.Jetbrains.Kotlinx.Coroutines.Core)
            }
        }

        commonTest {
            dependencies {
                implementation(project(":mvikotlin-main"))
                implementation(project(":rx"))
                implementation(Deps.Badoo.Reaktive.Utils)
            }
        }
    }
}
