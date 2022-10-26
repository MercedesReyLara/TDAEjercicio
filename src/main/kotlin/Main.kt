fun main(args: Array<String>) {
    do {
        println("****BIENVENIDO****")
        println("Seleccione una opción: ")
        println("1)Incorporarse a la fila")
        println("2)Colarme")
        println("3)Ponerme delante de")
        println("4)¿Cuantas personas hay en la lista?")
        print("Elije una opción: ")
        var r = readLine()?.toIntOrNull()
        var numero: Int = r ?: 0

        if (numero == 1) {
            if (fila.size < 100) {
                print("Introduzca su DNI: ")
                var tmp: String? = readLine()
                var dni = tmp.toString()

                print("Introduzca su nombre: ")
                var tmp2: String? = readLine()
                var nombre = tmp.toString()

                print("Introduzca su telefono: ")
                var tmp3: String? = readLine()
                var telefono = tmp.toString()

                val p = Persona(dni, fila.lastIndex + 1, nombre, telefono)
                fila.add(p)
                comprarEntrada()
            } else {
                println("Imposible añadir mas personas a la lista")
            }
       /* } else if (numero == 2) {
            colarse()
            comprarEntrada()
        } else if (numero == 3) {
*/
        } else if (numero == 4) {
            longitudFila()
        } else {
            print("OPCION NO DISPONIBLE")
            return
        }
        var salir:Boolean=false
     print("¿Desea salir(S/N)?: ")
        var s: String? = readLine()
        if(s=="S"){
            salir=true
        }
    }while(!salir)
}