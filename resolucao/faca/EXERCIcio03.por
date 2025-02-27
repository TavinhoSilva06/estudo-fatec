programa
{
  funcao inicio()
  {
    inteiro natalidade1
    inteiro natalidade2
    real nat1
    real nat2
    inteiro ano
    inteiro A
    inteiro B

    A = 5000000
    B = 7000000
    ano = 0 

    enquanto(A <= B){
      nat1 = 0.03
      nat2 = 0.02
      natalidade1 = A * nat1
      natalidade2 = B * nat2
      A = A + natalidade1
      B = B + natalidade2
      ano = ano + 1
    }

    se(A > B){
      escreva("Demorou ", ano, " anos para a população do país A passar o B")
    }
    
  }
}
