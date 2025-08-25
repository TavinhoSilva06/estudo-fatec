#include <iostream>
using namespace std;
 
int main() {
    double A[7], B[7];
    cout << "Digite 7 números para o vetor A: ";
    for (int i = 0; i < 7; i++) {
        cin >> A[i];
    }
 
    cout << "Digite 7 números para o vetor B: ";
    for (int i = 0; i < 7; i++) {
        cin >> B[i];
    }
 
    cout << "Soma: ";
    for (int i = 0; i < 7; i++) cout << A[i] + B[i] << " ";
    cout << "\nSubtração: ";
    for (int i = 0; i < 7; i++) cout << A[i] - B[i] << " ";
    cout << "\nMultiplicação: ";
    for (int i = 0; i < 7; i++) cout << A[i] * B[i] << " ";
    cout << "\nDivisão: ";
    for (int i = 0; i < 7; i++) {
        if (B[i] != 0)
            cout << A[i] / B[i] << " ";
        else
            cout << "N/A ";
    }
    cout << endl;
    return 0;
}