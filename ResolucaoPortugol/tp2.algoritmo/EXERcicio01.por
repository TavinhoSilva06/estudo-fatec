programa {
  funcao inicio() {
    real salario
    inteiro bonus
    inteiro escola
    inteiro i

    para(i=1; i<=25; i++){
      escreva("\n Digite seu salário: ")
      leia(salario)

      se(salario <= 1000){
        escola = 350
        escreva("Seu auxílio escola será de: ", salario + escola)
      }

      se(salario > 1000){
        escola = 300
        escreva("Seu auxílio escola será de: ", salario + escola)
      }

      senao se(salario <= 1500){
        bonus = salario + 5/100
        escola = 300
        escreva("Seu auxílio escola será de: ", escola + bonus)
      }

      senao se(salario >= 1500.01 e salario <= 2200){
        bonus = salario + 12/100
        escola = 300
        escreva("Seu auxílio escola será de: ", escola + bonus)
      }

      senao se(salario > 2200){
        escola = 300
        escreva("Seu auxílio escola será de: ", escola + bonus)
      }

      senao {
        escreva("Valor inválido")
      }
    }
  }
}
