programa {
  funcao inicio() {
    inteiro n1
    inteiro n2
    inteiro operacao
    real resultado

    escreva("Digite o primeiro número: ")
    leia(n1)

    escreva("Digite o segundo número: ")
    leia(n2)

    escreva("Escreva o código de operação: ")
    leia(operacao)

    escolha(operacao){
      caso 1:
        resultado = n1 + n2
        escreva("Resultado: ", resultado)
        pare

      caso 2:
        escreva("Resultados das subtrações: ", n1 - n2, " e ", n2 - n1)
        pare

      caso 3:
        resultado = n1 * n2
        escreva("Resultado: ", resultado)
        pare

      caso 4:
        se (n2 e n1 != 0) {
          escreva("Resultados das divisões: ", n1 / n2, " e ", n2 / n1)
        } senao {
          escreva("Divisão por zero não é permitida!")
        }
        pare

      caso contrario:
        escreva("Informação inválida")
    }
  }
}
