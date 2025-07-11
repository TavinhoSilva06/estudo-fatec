package ExerciciosCurso3.Parte4.exercicio01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> ListaNumeros = new ArrayList<>();

        ListaNumeros.add(8);
        ListaNumeros.add(5);
        ListaNumeros.add(3);
        ListaNumeros.add(9);
        ListaNumeros.add(10);
        ListaNumeros.add(1);
        ListaNumeros.add(4);
        ListaNumeros.add(2);
        ListaNumeros.add(7);
        ListaNumeros.add(6);

        Collections.sort(ListaNumeros);
        System.out.println(ListaNumeros);

    }
}
