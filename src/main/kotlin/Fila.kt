var fila= mutableListOf<Persona>()
fun longitudFila(){
    print("La longitud de la fila es ${fila.size}")
    for(persona in fila){
        println("Nombre: ${persona.nombre}")
    }
}
/*fun cerrarFila(){
    if()
}*/
fun vaciarFila(){
    fila.clear()
    print("Vaciando fila....")
    print("La fila está vacía. Su tamaño es de ${fila.size}")
}
fun comprarEntrada(){
    println("****MENU DE COMPRA DE ENTRADA****")
    print("Introduce tu DNI: ")
    var tmp: String? = readLine()
    var dni = tmp.toString()
    for(persona in fila) {
        if(persona.DNI==dni){
                print("Entrada comprada")
                fila.remove(persona)
        }else{
            print("No estás en la cola")
            return
        }
    }
    }
fun colarse() {
    if (fila.size > 2) {
        print("Introduce el DNI de la persona que conoces: ")
        var tmp2: String? = readLine()
        var dni2 = tmp2.toString()
        for (persona in fila) {
            if (persona.DNI == dni2) {
                println("Conoces a ${persona.nombre},te pondremos detrás suya")
                print("Introduce tu DNI por favor: ")
                var tmp: String? = readLine()
                var dni = tmp.toString()

                print("Introduce tu nombre por favor: ")
                var n: String? = readLine()
                var nombre = tmp.toString()

                print("Introduce tu telefono por favor: ")
                var t: String? = readLine()
                var tlf = tmp.toString()

                var personaAColar = Persona(dni, persona.numeroFila + 1, nombre, tlf)
                fila.add(personaAColar)

            } else {
                print("No conoces a nadie")
                return
            }
        }
    }else{
        print("No podemos colarte ahora mismo")
    }
}
fun delanteDe() {
    if(fila.size>2) {
        print("Introduce el DNI de la persona que conoces: ")
        var tmp2: String? = readLine()
        var dni2 = tmp2.toString()
        for (persona in fila) {
            if (persona.DNI == dni2) {
                println("Conoces a ${persona.nombre},te pondremos delante suya")
                print("Introduce tu DNI por favor: ")
                var tmp: String? = readLine()
                var dni = tmp.toString()

                print("Introduce tu nombre por favor: ")
                var n: String? = readLine()
                var nombre = tmp.toString()

                print("Introduce tu telefono por favor: ")
                var t: String? = readLine()
                var tlf = tmp.toString()

                var personaAColar = Persona(dni, persona.numeroFila - 1, nombre, tlf)
                fila.add(personaAColar)

            } else {
                print("No conoces a nadie")
                return
            }
        }
    }else{
        print("No podemos ponerte delante de nadie ahora mismo")
    }
}

