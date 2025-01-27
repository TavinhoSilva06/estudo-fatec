programa {
  funcao inicio() {
    inteiro i
    inteiro voto

    para(i=1; i<=30; i++){
      escreva("Digite o código do seu voto: ")
      leia(voto)
      
      se(voto <= 3){
        escreva("O voto foi para o canditado ", voto, "\n")
      }

      senao se(voto == 4) {
        escreva("O voto foi nulo \n")
      }

      senao se(voto == 5) {
        escreva("O voto foi branco \n")
      }
    }
  }
}
