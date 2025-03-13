programa
{
   inclua biblioteca Matematica --> mat
    funcao inicio()
    {
        inteiro numero 
        inteiro primos = 0

        primos = 0

        enquanto (verdadeiro)
        {
            escreva("Digite um número inteiro: ")
            leia(numero)

            se (numero < 0)
            {
                escreva("Valor inválido")
            }

            se (ehPrimo(numero))
            {
                primos = primos + 1
            }
        }

        escreva("Quantidade de números primos digitados: ", primos)
    }

    funcao ehPrimo(real n)
    {
        se (n <= 1)
        {
            escreva("Valor inválido")
        }

        para (inteiro i = 2; i <= mat.raiz(n); i++)
        {
            se (n % i == 0)
            {
                escreva("não é primo")
            }
        }

        escreva(n)
    }
}