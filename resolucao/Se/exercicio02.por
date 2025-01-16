programa {
  funcao inicio() {
    inteiro idd1
    inteiro idd2
    inteiro ano
    inteiro ano1
    inteiro ano2
    caracter nome1
    caracter nome2
    

    escreva("Escreva seu nome: ")
    leia(nome1)

    escreva("Escreva seu ano de nascimento: ")
    leia(ano1)
    
    escreva("Escreva seu nome: ")
    leia(nome2)

    escreva("Escreva seu ano de nascimento: ")
    leia(ano2)

    ano = 2025
    idd1 = ano-ano1
    idd2 = ano-ano2

    se(idd1 > idd2){
      escreva(nome2, "É mais novo que", nome1)
    }

    senao se (idd2 > idd1) {
      escreva(nome1, "É mais novo que", nome2)
    }

    senao {
      escreva("Os dois tem a mesma idade")
    }
  }
}
