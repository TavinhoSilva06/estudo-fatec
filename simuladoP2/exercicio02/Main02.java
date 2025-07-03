package exercicio02;

import java.util.ArrayList;
import java.util.List;

public class Main02 {
    public static void main(String[] args) {
        List<Aluno> listaAlunos = new ArrayList<>();

        
        Aluno aluno1 = new Aluno("Carlos");
        aluno1.adicionarNota(8.5);
        aluno1.adicionarNota(7.0);
        aluno1.adicionarNota(9.2);

        Aluno aluno2 = new Aluno("Ana");
        aluno2.adicionarNota(6.8);
        aluno2.adicionarNota(7.5);
        aluno2.adicionarNota(8.0);

       
        listaAlunos.add(aluno1);
        listaAlunos.add(aluno2);
        
        for (Aluno aluno : listaAlunos) {
            System.out.println(aluno);
        }
    }
}