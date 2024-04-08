open class Contador {

    var contador:Int
    constructor(contador:Int ) {
        this.contador = contador
    }

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