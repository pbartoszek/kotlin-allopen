package pl.petrof

import java.lang.reflect.Modifier

@OpenClass
class KotlinComponent {
    fun execute(): String {
        println("Running execute method")
        println("Class is final - " + Modifier.isFinal(this.javaClass.modifiers));
        println("Method is final - " + Modifier.isFinal(this.javaClass.getMethod("execute").modifiers));
        return "My component result"
    }
}