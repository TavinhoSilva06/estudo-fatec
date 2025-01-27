
programa {
  funcao inicio() {
    inteiro n1
    inteiro n2
    inteiro R
    escreva("Digite um número: ")
    leia(n1)

    escreva("Digite um número: ")
    leia(n2)

    R = n1 % n2

    se(R == 0) {
      escreva("Divisão exata")
    }

    senao {
      escreva("Divisão não exata ", R)
    }
  }
}
