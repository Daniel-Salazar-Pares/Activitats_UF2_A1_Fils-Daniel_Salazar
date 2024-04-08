
import java.util.*
    import java.util.logging.Level
    import java.util.logging.Logger


class Fil : Thread(), Runnable {
    var tabs: Int = 0

    override fun run() {
        //Comença l'execució
        println("Aquest és el fil " + currentThread().name + " que començo ara.")

        val rnd = Random()

        //Executa 100 vegades el bucle. Dorm una estona aleatòria i mostra un missatge
        for (i in 1..100) {
            try {
                // S'adorm un temps aleatori entre 0 i 1000 ms
                sleep(rnd.nextInt(100).toLong())
            } catch (ex: InterruptedException) {
                Logger.getLogger(Fil::class.java.name).log(Level.SEVERE, null, ex)
            }
            // Imprimeix tabuladors
            for (j in 0 until tabs) {
                print("\t")
            }
            // Imprimeix el missatge
            println("Hola des del fil " + currentThread().name + " i: " + i)
        }


        //Finalitza l'execució
        println("Aquest és el fil " + currentThread().name + " que acabo tot just ara mateix.")
    }
}
