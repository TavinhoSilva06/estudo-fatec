(INCOMPLETO)

programa
{
  funcao inicio()
  {
    inteiro media
    inteiro num
    inteiro soma
    inteiro valor
    inteiro i 

    soma = 0
    num = 0
  
    escreva("Digite um valor: ")
    leia(valor)

    enquanto(valor != 0){
      se(valor > 0){
      soma = soma + valor 
      num = num + 1
      media = soma / num
      }
      
    }

    se(valor < 0){
      escreva("Valor inválido")
    }
  }
}
