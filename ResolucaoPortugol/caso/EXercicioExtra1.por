programa {
  funcao inicio() {
    real altura
    inteiro peso
  
    escreva("Digite sua altura: ")
    leia(altura)

    escreva("Digite seu peso: ")
    leia(peso)

    se(altura < 1.20 e peso <= 60 ) {
      escreva("é igual a A")
    }

    senao se(altura >= 1.20 e altura <= 1.70 e peso <= 60) {
      escreva("é igual a B")
    }

    senao se(altura > 1.70 e peso <= 60 ) {
      escreva("é igual a C")
    }

    se(altura < 1.20 e peso >= 60 e peso <= 90 ) {
      escreva("é igual a D")
    }

    senao se(altura >= 1.20 e altura <= 1.70 e peso >= 60 e peso <= 90) {
      escreva("é igual a E")
    }

    senao se(altura > 1.70 e peso >= 60 e peso <= 90 ) {
      escreva("é igual a F")
    }

    se(altura < 1.20 e peso > 90 ) {
      escreva("é igual a G")
    }

    senao se(altura == 1.20 e altura <= 1.70 e peso > 90) {
      escreva("é igual a H")
    }

    senao se(altura > 1.70 e peso > 90 ) {
      escreva("é igual a I")
    }
  }
}
