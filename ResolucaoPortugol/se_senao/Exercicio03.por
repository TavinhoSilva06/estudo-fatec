programa {
  funcao inicio() {
    inteiro L1
    inteiro L2
    inteiro L3

    escreva("Escreva a medida do lado: ")
    leia(L1)

     escreva("Escreva a medida do lado: ")
    leia(L2)

     escreva("Escreva a medida do lado: ")
    leia(L3)

    se(L1 == L2){
      se(L2 == L3) {
        escreva("O triângulo é equilatero")
      }
    }

    senao se(L1 != L2 ) {
      se(L2 != L3) {
        escreva("O triângulo é escaleno")
      }
    }

    senao se(L1 == L2) {
      se(L1 e L2 != L3) {
        escreva("O triângulo é isósceles")
      }
    }

    senao se(L1 == L3) {
      se(L1 e L3 != L2) {
        escreva("O triângulo é isósceles")
      }
    }

    senao se(L2 == L3) {
      se(L2 e L3 != L1) {
        escreva("O triângulo é isósceles")
      }
    }
  }
}