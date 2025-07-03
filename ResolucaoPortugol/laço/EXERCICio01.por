programa {
  inclua biblioteca Matematica -->mat
  funcao inicio() {
    inteiro i
    real num
    real resultado

    para(i=1; i<=10; i++){
      escreva("Digite um número: ")
      leia(num)

      se(num >= 0){
      resultado = mat.raiz(num, 2)
      escreva("A raiz quadrada é: ", resultado, "\n")
      }

      senao{
        escreva("Valor invalido \n")
      }
    }
  }
}
