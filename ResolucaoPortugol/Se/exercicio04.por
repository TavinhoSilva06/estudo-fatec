programa {
  funcao inicio() {
    real Salario
    real Bonus

    escreva("Digite seu salário: ")
    leia(Salario)

    se(Salario <= 500.00){
        Bonus = Salario * 20/100 + Salario
        escreva("Aumento será de 20% ", Bonus)
    }

    senao{
      Bonus = Salario * 10/100 + Salario
      escreva("Aumento será de 10% ", Bonus)
    }
  }
}
