programa
{
    funcao inicio()
    {
        inteiro i
        real pe1[20] 
        real pr2[20] 
        real media[20]
        cadeia nomes[20] 
        cadeia situacao[20]

        para (i = 0; i < 20; i++)
        {
            escreva("Digite o nome do aluno ", (i+1), ": ")
            leia(nomes[i])
            escreva("Digite a nota da PE1 do aluno ", (i+1), ": ")
            leia(pe1[i])
            escreva("Digite a nota da PR2 do aluno ", (i+1), ": ")
            leia(pr2[i])
            media[i] = (pe1[i] + pr2[i]) / 2
            se (media[i] >= 6.0)
            {
                situacao[i] = "AP"
            }
            senao
            {
                situacao[i] = "RP"
            }

            escreva(nomes[i], " ", "PR1: ", pe1[i], " ", "PR2: ", pr2[i], " ", "Média igual a: ", media[i], " ", situacao[i], "\n")
        }
    }
}