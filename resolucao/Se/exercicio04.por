programa {
  funcao inicio() {
    real S

    escreva("Digite seu salário: ")
    leia(S)

    se(S <= 500.00){
        escreva("Aumento será de 20%")
    }

    senao{
      escreva("Aumento será de 10%")
    }
  }
}
