package ExerciciosCurso3.Parte3.exercicio01;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Numeros> listaNumeros = new ArrayList<>();

        Numeros numero1 = new Numeros(1);
        Numeros numero2 = new Numeros(2);
        Numeros numero3 = new Numeros(3);
        Numeros numero4 = new Numeros(4);
        Numeros numero5 = new Numeros(5);
        Numeros numero6 = new Numeros(6);
        Numeros numero7 = new Numeros(7);
        Numeros numero8 = new Numeros(8);
        Numeros numero9 = new Numeros(9);
        Numeros numero10 = new Numeros(10);

        listaNumeros.add(numero1);
        listaNumeros.add(numero2);
        listaNumeros.add(numero3);
        listaNumeros.add(numero4);
        listaNumeros.add(numero5);
        listaNumeros.add(numero6);
        listaNumeros.add(numero7);
        listaNumeros.add(numero8);
        listaNumeros.add(numero9);
        listaNumeros.add(numero10);


        for(Numeros num : listaNumeros) {
            System.out.println("Número: " + num.getNumeros());
        }
    }
}
