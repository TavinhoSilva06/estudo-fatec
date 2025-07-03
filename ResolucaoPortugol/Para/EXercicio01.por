programa {
  funcao inicio() {
    inteiro i
    inteiro N
    inteiro M

    para(i=1; i<= 30; i++){
      escreva("Digite o número: ")
      leia(N)

      escreva("Digite o termo: ")
      leia(i)

      N = 7 
      M = N * i

      se(N < 7 e i>30) {
        escreva("Informação inválida")
      }

      senao {
        escreva(M)
      }

    }
  }
}
