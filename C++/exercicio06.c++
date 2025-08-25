#include <iostream>
#include <algorithm>
using namespace std;
 
int main() {
    int vetor[8];
    cout << "Digite 8 números: ";
    for (int i = 0; i < 8; i++) {
        cin >> vetor[i];
    }
 
    sort(vetor, vetor + 8);
 
    cout << "Vetor ordenado: ";
    for (int i = 0; i < 8; i++) {
        cout << vetor[i] << " ";
    }
    cout << endl;
    return 0;
}