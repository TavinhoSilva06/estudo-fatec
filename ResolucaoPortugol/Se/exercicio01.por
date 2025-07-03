programa {
  funcao inicio() {
    
    inteiro nota1 
    inteiro nota2
    inteiro media

    escreva ("Digite sua primeira nota: ")
    leia(nota1)

    escreva("Digite sua segunda nota: ")
    leia(nota2)

    media = nota1+nota2/2

    se(media >= 6) {
      escreva("Média igual ou  superior à média Mínima (6,0) ")
    }

    senao {
      escreva ("Média inferior a média mínima (6,0)")
    }
  }
}