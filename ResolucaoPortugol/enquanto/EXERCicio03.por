programa {
  funcao inicio() {
    inteiro candidato

    escreva("Digite o número do seu candidato: ")
    leia(candidato)

    enquanto(candidato <= 4){
      escreva("Seu voto foi para o candidato: ", candidato)
      leia(candidato)
    }

    enquanto(candidato == 5){
      escreva("Seu voto foi nulo")
      leia(candidato)
    }

    enquanto(candidato == 6){
      escreva("Seu voto foi branco")
      leia(candidato)
    }
  }
}
