package exercicio04;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Numeros> OrdemNumeros = new ArrayList<>();

        Numeros Ordem = new Numeros();
        Ordem.adicionarNum(10);
        Ordem.adicionarNum(20);
        Ordem.adicionarNum(30);

        OrdemNumeros.add(Ordem);

        
        for (Numeros numero : OrdemNumeros) {
            numero.exibirNumeros(); 
        }
    }
}