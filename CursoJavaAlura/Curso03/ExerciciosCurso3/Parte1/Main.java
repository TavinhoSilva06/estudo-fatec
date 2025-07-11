package ExerciciosCurso3.Parte1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pessoa> ListaDePessoas = new ArrayList<>();

        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Otávio");
        pessoa1.setIdade(19);

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("Felipe");
        pessoa2.setIdade(30);

        Pessoa pessoa3 = new Pessoa();
        pessoa3.setNome("Carlos");
        pessoa3.setIdade(11);


        ListaDePessoas.add(pessoa1);
        ListaDePessoas.add(pessoa2);
        ListaDePessoas.add(pessoa3);
        System.out.println("Tamanho da lista: " + ListaDePessoas.size());
        System.out.println(ListaDePessoas.get(0).toString());
        System.out.println(ListaDePessoas.toString());


    }
}
