programa
{
    funcao inicio()
    {
        inteiro matriz[5][5]
        inteiro i
        inteiro j

        para (i = 0; i < 2; i++)
        {
            para (j = 0; j < 5; j++)
            {
                escreva("Digite o elemento da matriz[", i, "][", j, "]: ")
                leia(matriz[i][j])
            }
        }

        escreva("Digite o número da linha que deseja imprimir: ")
        leia(i)

        se (i >= 0 e i <= 4)
        {
            escreva("Elementos da linha ", i, ": ")
            para (j = 0; j < 5; j++)
            {
                escreva(matriz[i][j])
            }
        }
        senao
        {
            escreva("Linha inválida.")
        }
    }
}