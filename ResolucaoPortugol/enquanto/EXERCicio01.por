programa {
  funcao inicio() {
    real chico
    real ze
    inteiro ano

    chico = 1.50
    ze = 1.10
    ano = 0
    
    
    /*faca{
      ze = ze + 0.03
      chico = chico + 0.02
      ano = ano + 1
    }
    enquanto(ze<=chico)*/
    
    enquanto(ze<=chico){
      ze = ze + 0.03
      chico = chico + 0.02
      ano = ano + 1
    }

    se(ze > chico) {
      escreva("Demorou ", ano, " anos para zé ser maior que chico")
      leia(ano)
    }
  }
}
