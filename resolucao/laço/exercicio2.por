programa {
  funcao inicio() {
    inteiro i
    inteiro fat
    inteiro x

    fat = 1
  
    para(i=1; i<=10; i++){
      escreva("Digite um número: ")
      leia(x)

      se(x > 0){
        fat = fat * x
        x = x - 1
        escreva("A fatorial é: ", fat, "\n")
      }

      senao {
        escreva("Valor inválido \n")
      }
    }
  }
}
