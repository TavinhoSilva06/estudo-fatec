programa
{
    funcao inicio()
    {
        real massaInicial 
        real massaAtual
        inteiro tempo 
        inteiro contador

        para (contador = 1; contador <= 100; contador++)
        {
            escreva("Digite a massa inicial do material ", contador, ": ")
            leia(massaInicial)
            massaAtual = massaInicial
            tempo = 0

            enquanto (massaAtual >= 0.10)
            {
                massaAtual = massaAtual - (massaAtual * 0.25) 
                tempo = tempo + 30 
            }

            escreva("Para a massa inicial ", massaInicial, " gramas, o tempo foi de ", tempo, " segundos.\n")
        }
    }
}