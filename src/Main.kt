package fundamentos.controles

fun main(args: Array<String>) {

    val nota = 4

    when(nota) {
        10, 9 -> print("Fantástico")
        8, 7 -> print("Parabéns")
        6, 5, 4 -> print("Tem como recuperar")
        // A próxima linha, deve ser corrigida pelo simples fato do < estar do lado ao contrário, então deve ser mudado o número 3 pelo 0 e verificar novamente, para não ocorrer a persistência do erro
        in 0..3 -> print("Te vejo no próximo semestre")
        else -> print("Nota inválida")
    }
}