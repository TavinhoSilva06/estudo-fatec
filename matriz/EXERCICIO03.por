programa
{
    funcao inicio()
    {
        inteiro matriz[2][2]
        inteiro matrizResultante[2][2] 
        inteiro maiorElemento 
        inteiro i 
        inteiro j

        maiorElemento = 0

        para (inteiro i = 0; i < 2; i++)
        {
            para (inteiro j = 0; j < 2; j++)
            {
                escreva("Digite o elemento da matriz[", i, "][", j, "]: ")
                leia(matriz[i][j])
                se (matriz[i][j] > maiorElemento)
                {
                    maiorElemento = matriz[i][j]
                }
            }
        }

        para (i = 0; i < 2; i++)
        {
            para (j = 0; j < 2; j++)
            {
                matrizResultante[i][j] = matriz[i][j] * maiorElemento
            }
        }

        escreva("Matriz resultante:")
        para (i = 0; i < 2; i++)
        {
            para (j = 0; j < 2; j++)
            {
                escreva(matrizResultante[i][j])
            }
        }
    }
}