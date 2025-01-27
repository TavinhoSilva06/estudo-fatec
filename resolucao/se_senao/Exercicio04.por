programa {
  funcao inicio() {
    inteiro N
    inteiro i

    escreva("Digite um número: ")
    leia(N)

    para(i=500; i<=1000; i++) {
    leia(N)

    se(N == 5) {
      escreva("Ele é igual a 5")
    }

    senao se(N == 200) {
      escreva("Ele é igual a 200")
    }

    senao se(N == 400) {
      escreva("Ele é igual a 400")
    }
    }
  }
}
