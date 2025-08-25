#include <iostream>
using namespace std;
int main()
{
    int i = 0;
    int vetor[10];

    for(i = 0; i <= 9; i++) {
        cout << "Digite o elemento do vetor: \n";
        cin >> vetor[i];
        if (vetor[i] < 0) {
            cout << "Valor inválido";
            break;
        }
    }
    for (int y = 0; y<i; y++) {
        cout << vetor[y]*(-1)<<"\n";
    }
 
    return 0;
}