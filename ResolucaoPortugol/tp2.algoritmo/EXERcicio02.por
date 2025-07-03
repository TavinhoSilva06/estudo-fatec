programa {
  funcao inicio() {
 logico eh_primo 
 inteiro numero
 real raiz_quadrada

    escreva("Digite um número: ")
    leia(numero)
    
    se (numero <= 1) {
        escreva ("falso")
    }
    
    para (inteiro i = 2; i <= raiz_quadrada(numero); i++) {
        se (numero % i == 0) {
            escreva("falso")
        }
    }
    
    // Verifica se o número é primo e exibe o resultado
    se (eh_primo(numero)) {
        escreva(numero, " é primo")
    }
    
    senao {
        escreva(numero, " não é primo")
  }
  }
}
