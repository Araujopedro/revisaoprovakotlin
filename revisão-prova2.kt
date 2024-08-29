import java.util.* // importa a classe

fun main(){// função de executar o programa
    val scanner = Scanner(System.`in`)// cria um obj scanner para a leitura da entrada do usuario
    var sair: Char //Declaração da variavel 'sair' para armazenar a escolha de continuar ou sair

    do {
        coletarDados() //chama a função 'coletarDados' para obter informações do usuario
        println("Tecle [c] cara continuar ou [s] para sair: ")
        sair = scanner.next()[0]
    } while (sair != 's')
}
fun coletarDados(){
    val  scanner = Scanner(System.`in`)
    var peso: Float
    var altura : Float

    print("Qual seu peso atual?: ")
    peso = scanner.nextFloat()
    print("qual sua altura?: ")
    altura = scanner.nextFloat()

    val imc = calculodoimc(peso, altura)
    println ("seu IMC é %.2f | ".format(imc))

    when{
        imc < 18.5 -> println("Excesso de magreza")
        imc < 25 -> println ("peso normal")
        imc < 30 -> println ("execsso de peso")
        imc < 35 -> println ("obesidade g1")
        imc < 40 -> println("obesidade g2")
        else -> println("obseidade g3")
    }

}
fun calculodoimc(peso: Float, altura: Float):Float{
    val result = peso /(altura * altura) //calcula o imc dividindo o peso pela altura
    return result
}