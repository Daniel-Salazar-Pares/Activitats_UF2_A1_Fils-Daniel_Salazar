import java.lang.Thread.sleep
import kotlin.random.Random

class Fil_Incremental(contador: Contador) : Thread(), Runnable {
    var contador:Contador = contador
    override fun run() {
        println("Aquest és el fil " + Thread.currentThread().name + " que començo ara.")
        //generar num random de 0 a 10
        val rnd = Random
        val num = rnd.nextInt(0, 1)
        for (i in 1..100000) {

            try {
                sleep(num.toLong())
            } catch (ex: InterruptedException) {
                println("Error")
            }
            println("Aquest és el fil " + Thread.currentThread().name +", el contador es: " + contador.tronarValor())
            contador.incrementar()

        }
    }


}