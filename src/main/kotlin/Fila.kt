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
                fila.remove(persona)A
        }else{
            print("No estás en la lista")
            return
        }
    }
    }
fun colarse(){
    var pt=Persona("111111111A",0,"Hola","123456789")

    print("Introduce tu DNI por favor: ")
    var tmp:String?=readLine()
    var dni=tmp.toString()

    print("Introduce tu nombre por favor: ")
    var tmp1:String?=readLine()
    var nombre=tmp1.toString()

    print("Introduce tu telefono por favor: ")
    var tmp2:String?=readLine()
    var tlf=tmp1.toString()

    pt.DNI=dni
    pt.nombre=nombre
    pt.telefono=tlf
    print("¿Conoce a alguien de esta fila? Si es así inserte el DNI por favor: ")
    var r:String?=readLine()
    for(persona in fila){
        if(persona.DNI==r){
            print("Conoces a ${persona.nombre},te pondremos detrás suya")
            fila.add(persona.numeroFila+1,persona)
        }
        break
    }
}
