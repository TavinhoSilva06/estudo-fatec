package ExerciciosCurso3.Parte4.exercicio03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {
        /// Mesmo com essas três maneiras de declarar uma lista, para coisas básicas como add, essas 3 podem funcionar
        /// normalmente, na qual elas tem especificações diferentes e algumas consumindo menos memória do que outra.
        //List<Titulos> ListaTitulos = new ArrayList<>();
        //ArrayList<Titulos> ListaTitulos = new ArrayList<>();
        List<Titulos> ListaTitulos = new LinkedList<>();


        Titulos titulo1 = new Titulos("Otávio");
        Titulos titulo2 = new Titulos("Felipe");
        Titulos titulo3 = new Titulos("Jenmara");
        Titulos titulo4 = new Titulos("Mario");

        ListaTitulos.add(titulo1);
        ListaTitulos.add(titulo2);
        ListaTitulos.add(titulo3);
        ListaTitulos.add(titulo4);

        Collections.sort(ListaTitulos);
        System.out.println(ListaTitulos.toString());
    }
}
