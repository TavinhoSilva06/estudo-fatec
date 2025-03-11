programa {
  funcao inicio() {
    inteiro x
    inteiro fat

    fat = 1

    faca{
      escreva("Digite um número: ")
      leia(x)
    }enquanto(x < 1)

    enquanto(x > 0){
      fat = fat * x
      x = x - 1
    }

    escreva("Fatorial: ", fat)
  }
}
