programa {
  funcao inicio() {
    caracter aluno
    inteiro n1
    inteiro n2 
    inteiro n3

    escreva("Digite sua primeira nota: ")
    leia(n1)

    escreva("Digite sua segunda nota: ")
    leia(n2)

    escreva("Digite sua terceira nota: ")
    leia(n3)

    se(n1 > n2 ){
      se(n1 > n3){
        escreva("Sua maior nota é:", n1)
      }
    }

    senao se(n2 > n1) {
      se(n2 > n3){
        escreva("Sua maior nota é:", n2)
      }
    }

    senao se(n3 > n1){
      se(n3 > n2){
        escreva("Sua maior nota é:", n3)
      }
    }

    senao{
      escreva("As notas são iguais")
    }

  }
}
