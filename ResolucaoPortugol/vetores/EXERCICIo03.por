programa
{
    funcao inicio()
    {
        inteiro i
        inteiro j  
        inteiro numero
        real vetor[100]

        i = 0

        enquanto (i < 1)
        {
            escreva("Digite um número inteiro positivo: ")
            leia(numero)
            se (numero < 0)
            {
                escreva("Valor inválido\n")
            }
            vetor[i] = numero
            i++
        }

        escreva("Vetor com elementos inversos: ")
        para (j = 0; j < i; j++)
        {
            escreva(vetor[j] * -1)
        }
    }
}