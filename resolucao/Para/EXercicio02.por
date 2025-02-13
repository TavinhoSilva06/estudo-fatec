programa {
  funcao inicio() {
    inteiro i
    inteiro MM
    inteiro M
    inteiro MN
    inteiro media

    para(i=1; i<= 50; i++){      
      escreva("\n Digite a sua maior nota: ")
      leia(MM)

      escreva("\n Digite a sua menor nota: ")
      leia(MN)

      M = MM + MN
      media = M / 2
      escreva(media)
    }
  }
}
