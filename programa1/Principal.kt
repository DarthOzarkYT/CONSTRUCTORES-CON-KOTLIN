package programa1

var lado1: Int=0
var lado2: Int=0
var lado3: Int=0

class Triangulo(var lado1: Int, var lado2: Int, var lado3: Int){
    fun inicializar(){
        print("Dame el valor del lado 1: ")
        lado1 = readLine()!!.toInt()
        print("Dame el valor del lado 2: ")
        lado2 = readLine()!!.toInt()
        print("Dame el valor del lado 3: ")
        lado3 = readLine()!!.toInt()
    }

    fun ladoMayor(){
        print("Lado mayor: ")
        if(lado1>lado2 && lado1>lado3 ){
            println(lado1)
        }else{
            if(lado2>lado3){
                println(lado2)
            }else{
                println(lado3)
            }
        }
    }

    fun esEquilatero(){
        if(lado1==lado2 && lado1==lado3){
            println("Es un triangulo equilatero")
        }else{
            println("No es un triangulo equilatero")
        }
    }
}

fun main(){
    val triangulo1 = Triangulo(lado1, lado2, lado3)
    triangulo1.inicializar()
    triangulo1.ladoMayor()
    triangulo1.esEquilatero()
}
