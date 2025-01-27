programa
{
  funcao inicio()
  {
    inteiro Limite
    inteiro soma
    inteiro i
    inteiro j
    inteiro k

    escreva("Digite o primeiro limite: ")
    leia(i)

    escreva("Digite o segundo limite: ")
    leia(j)

    soma = 0
    para(k = i; k <= j; k++)
    {
      se (k % 2 == 0)
      {
        soma = soma + k
      }
    }

    Limite = soma
    
    escreva("A soma dos pares no intervalo é: ", Limite)
  }
}
