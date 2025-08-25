#include <iostream>
#include <string>
using namespace std;
 
int main() {
    string palavra;
    cout << "Digite uma palavra: ";
    cin >> palavra;
 
    cout << "Palavra invertida: ";
    for (int i = palavra.length() - 1; i >= 0; i--) {
        cout << palavra[i];
    }
    cout << endl;
    return 0;
}