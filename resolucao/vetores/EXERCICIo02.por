programa
{
    funcao inicio()
    {
        inteiro i, j
        inteiro conjunto1[10] 
        inteiro conjunto2[20] 
        inteiro iguais[10]
        inteiro tamanhoIguais 

        tamanhoIguais = 0

        para (i = 0; i < 10; i++)
        {
            escreva("Digite o ", (i+1), "º elemento do conjunto 1: ")
            leia(conjunto1[i])
        }

        para (i = 0; i < 20; i++)
        {
            escreva("Digite o ", (i+1), "º elemento do conjunto 2: ")
            leia(conjunto2[i])
        }

        para (i = 0; i < 10; i++)
        {
            para (j = 0; j < 20; j++)
            {
                se (conjunto1[i] == conjunto2[j])
                {
                    iguais[tamanhoIguais] = conjunto1[i]
                    tamanhoIguais++
                    pare
                }
            }
        }

        escreva("Elementos iguais nos dois conjuntos: ")
        para (i = 0; i < tamanhoIguais; i++)
        {
            escreva(iguais[i])
        }
    }
}