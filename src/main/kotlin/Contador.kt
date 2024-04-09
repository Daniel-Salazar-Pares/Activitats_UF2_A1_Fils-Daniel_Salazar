open class Contador {

    var contador:Int
    constructor(contador:Int ) {
        this.contador = contador
    }
    @Synchronized //afegit nou
    fun incrementar () {
        this.contador++
    }

    @Synchronized //afeit nou
    fun decrementar () {
        this.contador--
    }

    fun tronarValor (): Int {
        return this.contador
    }
 }