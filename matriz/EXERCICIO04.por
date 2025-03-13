programa
{
    funcao inicio()
    {
        inteiro matriz[10][20] 
        inteiro somas[10] 
        inteiro matrizResultante[10][20]
        inteiro i, j

        para (i = 0; i < 10; i++)
        {
            somas[i] = 0
            para (j = 0; j < 20; j++)
            {
                escreva("Digite o elemento da matriz[", i, "][", j, "]: ")
                leia(matriz[i][j])
                somas[i] = somas[i] + matriz[i][j]
            }
        }

        para (i = 0; i < 10; i++)
        {
            para (j = 0; j < 20; j++)
            {
                matrizResultante[i][j] = matriz[i][j] * somas[i]
            }
        }

        escreva("Matriz resultante:\n")
        para (i = 0; i < 10; i++)
        {
            para (j = 0; j < 20; j++)
            {
                escreva(matrizResultante[i][j], " ")
            }
            escreva("\n") 
        }
    }
}
