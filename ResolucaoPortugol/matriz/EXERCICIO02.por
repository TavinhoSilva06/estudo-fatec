programa
{
    funcao inicio()
    {
        inteiro M[10][10]
        inteiro soma
        inteiro i
        inteiro j

        soma = 0
        para (i = 0; i < 10; i++)
        {
            para (j = 0; j < 10; j++)
            {
                escreva("Digite o elemento M[", i, "][", j, "]: ")
                leia(M[i][j])
            }
        }

        para (j = 0; j < 10; j++)
        {
            se ((j % 2) == 0) 
            {
                para (i = 0; i < 10; i++)
                {
                    soma = soma + M[i][j]
                }
            }
        }

        escreva("A soma dos elementos das colunas pares é: ", soma)
    }
}
