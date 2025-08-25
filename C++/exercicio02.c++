#include <iostream>
using namespace std;
int main()
{
    int i = 0;
    int vetor[10];
    int c = 0;

    for(i = 0; i <= 9; i++) {
        cout << "Digite o elemento do vetor: \n";
        cin >> vetor[i];
        if(vetor[i] == 0) {
            break;
        }
    }
    for(int y=0; y<i-1; y++){
            if(vetor[y] == vetor[i-1]) {
              c++;   
                }
            }
    cout<<"Números iguais: "<<c<<"\n";
 
    
    return 0;
}