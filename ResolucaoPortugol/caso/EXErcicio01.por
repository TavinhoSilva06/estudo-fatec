programa {
  funcao inicio() {
    cadeia nome
    inteiro civil

    escreva("Digite seu nome: ")
    leia(nome)

    escreva("Digite seu estado civil: ")
    leia(civil)


    escolha(civil){
      caso 1:
      escreva("O ", nome, " é casado")
      pare
    
      caso 2:
      escreva("O ", nome, " é solteiro")
      pare

      caso 3:
      escreva("O ", nome, " é divorciado")
      pare

      caso 4:
      escreva("O ", nome, " é viúvo")
      pare

      caso contrario:
      escreva("Informação inválida")
    }


  }
}
