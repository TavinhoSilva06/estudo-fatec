programa
{
  funcao inicio()
  {
    inteiro produto
    inteiro num1
    inteiro num2

    produto = 0

    escreva("Digite o primeiro número: ")
    leia(num1)

    escreva("Digite o segundo número: ")
    leia(num2)

    se(num1 % 2 == 0 e num2 % 2 == 0){
      produto = num1 * num2
      escreva(produto)
      leia(produto)
    }

    senao{
      escreva("Valor inválido")
      leia(produto)
    }
  }
}
