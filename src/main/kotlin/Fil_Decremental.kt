import java.lang.Thread.sleep
import kotlin.random.Random

class Fil_Decremental : Contador(), Runnable {
    override fun run() {
        println("Aquest és el fil " + Thread.currentThread().name + " que començo ara.")
        val rnd = Random
        val num = rnd.nextInt(0, 10)
        for (i in 1..300) {
            try {
                sleep(num.toLong())
            } catch (ex: InterruptedException) {
                println("Error")
            }
            decrementar()
            println("El contador es: " + tronarValor())
        }
    }
}