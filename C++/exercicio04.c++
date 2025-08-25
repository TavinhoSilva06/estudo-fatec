#include <iostream>
using namespace std;
 
int fatorial(int n) {
    int fat = 1;
    for (int i = 2; i <= n; i++) {
        fat = fat * i;
    }
    return fat;
}
 
int main() {
    int V[10], W[10];
    cout << "Digite 10 números: ";
    for (int i = 0; i < 10; i++) {
        cin >> V[i];
        W[i] = fatorial(V[i]);
    }
 
    cout << "Fatoriais: ";
    for (int i = 0; i < 10; i++) {
        cout << W[i] << " ";
    }
    cout << endl;
    return 0;
}