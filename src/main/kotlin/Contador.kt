open class Contador {

    var contador:Int = 0

    fun incrementar () {
        this.contador++
    }

    fun decrementar () {
        this.contador--
    }

    fun tronarValor (): Int {
        return this.contador
    }
 }