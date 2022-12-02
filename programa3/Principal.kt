package programa3

class Punto(val x: Int, val y: Int){
    fun retornarCuadrante() = when{
        x>0 && y>0 -> "Primer Cuadrante"
        x<0 && y>0 -> "Segundo Cuadrante"
        x<0 && y<0 -> "Tercer Cuadrante"
        x>0 && y<0 -> "Cuarto Cuadrante"
        else -> "Un eje"
    }
}

fun main(){
    val punto1= Punto(12,3)
    println("La coordenada ${punto1.x}, ${punto1.y} se encuentra en ${punto1.retornarCuadrante()}")
    val punto2= Punto(-4,3)
    println("La coordenada ${punto2.x}, ${punto2.y} se encuentra en ${punto2.retornarCuadrante()}")
    val punto3= Punto(-2,-2)
    println("La coordenada ${punto3.x}, ${punto3.y} se encuentra en ${punto3.retornarCuadrante()}")
    val punto4= Punto(12,-5)
    println("La coordenada ${punto4.x}, ${punto4.y} se encuentra en ${punto4.retornarCuadrante()}")
    val punto5= Punto(0,-5)
    println("La coordenada ${punto5.x}, ${punto5.y} se encuentra en ${punto5.retornarCuadrante()}")
}