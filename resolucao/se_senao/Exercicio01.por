programa {
  funcao inicio() {
    caracter nome
    inteiro P

    escreva("Digite seu nome: ")
    leia(nome)

    escreva("Digite a quantidade de produtos vendidos: ")
    leia(P)

    se(P <= 250){
      escreva("Comissão igual a R$ 1,00")
    }

    senao se(P <= 500){
      escreva("Comissão igual a 2,50")
    }

    senao {
      escreva("Comissão igual a 3,00")
    }
  }
}
