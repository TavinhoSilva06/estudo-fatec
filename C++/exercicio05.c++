#include <iostream>
using namespace std;
 
int main() {
    int vetor[12], maior, menor, pares = 0, soma = 0;
    cout << "Digite 12 números inteiros: ";
    for (int i = 0; i < 12; i++) {
        cin >> vetor[i];
        soma = soma + vetor[i];
        if (vetor[i] % 2 == 0) pares++;
        if (i == 0) {
            maior = menor = vetor[i];
        } else {
            if (vetor[i] > maior) maior = vetor[i];
            if (vetor[i] < menor) menor = vetor[i];
        }
    }
 
    cout << "Maior: " << maior << "\nMenor: " << menor << endl;
    cout << "Percentual de pares: " << (pares * 100.0 / 12) << "%" << endl;
    cout << "Média: " << (soma / 12.0) << endl;
    return 0;
}