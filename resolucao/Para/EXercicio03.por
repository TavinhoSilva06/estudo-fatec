programa
{
  funcao inicio()
  {
    inteiro Limite
    inteiro i
    inteiro j
    inteiro k

    escreva("Digite o primeiro limite: ")
    leia(i)

    escreva("Digite o segundo limite: ")
    leia(j)

    Limite = 0
    para(k = i; k <= j; k++)
    {
      se (k % 2 == 0)
      {
        Limite = Limite + k
      }
    }
    
    escreva("A soma dos pares no intervalo é: ", Limite)
  }
}
