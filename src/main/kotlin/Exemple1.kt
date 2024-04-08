
fun main(args: Array<String>) {
        // Creació dels fils
        val t1: Fil = Fil()
        val t2: Fil = Fil()

        // Canviem els noms als fils
        t1.setName("T1")
        t1.tabs = 0
        t2.setName("T2")
        t2.tabs = 2
        Thread.currentThread().name = "Main"

        println("Els fils secundaris encara no han començat. Aquest és el fil " + Thread.currentThread().name)
        t1.start()
        t2.start()
        t1.join()
        println("El T1 ja ha acabat")
        t2.join()
        println("El T2 ja ha acabat")
    }
