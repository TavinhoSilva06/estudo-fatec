(INCOMPLETO)

programa {
  funcao inicio() {
    inteiro numero

    escreva("escreva um número: ")
    leia(numero)

    enquanto(numero % 6 == 0) {
      escreva ("O quadrado de ", numero, " é ", numero * numero)
      leia (numero)
    }
  }
}