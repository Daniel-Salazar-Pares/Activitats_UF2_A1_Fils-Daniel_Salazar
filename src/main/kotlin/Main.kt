package org.example

import Contador
import Fil_Decremental
import Fil_Incremental

fun main() {
    val contador = Contador(0)
    val t1:Fil_Incremental = Fil_Incremental(contador)
    val t2:Fil_Decremental = Fil_Decremental(contador)
    t1.setName("T1")
    t2.setName("T2")
    t1.start()
    t2.start()
    t1.join()
    t2.join()
    println("El valor final del contador es: " + contador.tronarValor())
}