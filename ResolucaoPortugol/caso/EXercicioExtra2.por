programa {
  funcao inicio() {
    inteiro num
    inteiro i

    escreva("Digite um número: ")
    leia(num)

    para(i=1; i<=num; i++) {
      se(i % 3 == 0 e i % 5 == 0 ){ 
        escreva(" ",i)
      }
    }
  }
}
