import java.lang.Thread.sleep
import kotlin.random.Random

class Fil_Incremental: Contador(), Runnable {
    override fun run() {
        println("Aquest és el fil " + Thread.currentThread().name + " que començo ara.")
        //generar num random de 0 a 10
        val rnd = Random
        val num = rnd.nextInt(0, 10)
        for (i in 1..300) {
            try {
                sleep(num.toLong())
            } catch (ex: InterruptedException) {
                println("Error")
            }
            incrementar()
            println("El contador es: " + tronarValor())
        }
    }


}