programa
{
    funcao inicio()
    {
        inteiro i 
        inteiro totalPecas 
        real pecas[10]
        inteiro precos[10] 
        inteiro valorTotal[10]

        totalPecas = 0

        para (i = 0; i < 10; i++)
        {
            escreva("Digite a quantidade de peças vendidas pelo vendedor ", (i+1), ": ")
            leia(pecas[i])
            escreva("Digite o preço da peça vendida pelo vendedor ", (i+1), ": ")
            leia(precos[i])
            totalPecas = totalPecas + pecas[i]
            valorTotal[i] = pecas[i] * precos[i]

            escreva("Quantidade total de peças vendidas: ", totalPecas, "\n")
            escreva("Valor total da venda do vendedor ", (i+1), ": ", valorTotal[i], "\n")
        }
    }
}