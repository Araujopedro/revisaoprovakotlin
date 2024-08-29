fun main(){
    var qtcoxinha = 3
    var valorcoxinha = 5.00
    var valorcerveja = 15.00
    var qtcerveja = 2
    var taxagarcon = 0.10
    

    var multicoxinha = valorcoxinha * qtcoxinha
    var multicerveja = valorcerveja * qtcerveja
    var somatoria = multicerveja + multicoxinha
    var taxaservico = somatoria * 0.10
    var ccfinal = somatoria + taxaservico


    println("---------------------------------------")
    println("\tConsole")
    println("---------------------------------------")
    println("$qtcoxinha coxinhas \t\t R$ %.2f".format(multicoxinha))
    println("$qtcerveja coxinhas \t\t R$ %.2f".format(multicerveja))
    println("Somatoria \t\t R$ %.2f".format(somatoria))
    println("taxa 10%%  \t\t R$ %.2f".format(taxaservico))
    println("---------------------------------------")
    println("Conta final          \t\t R$ %.2f".format(ccfinal))

}