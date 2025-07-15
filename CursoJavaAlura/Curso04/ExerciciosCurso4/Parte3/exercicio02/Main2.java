package ExerciciosCurso4.Parte3.exercicio02;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        try {
            Criterios meuCriterio = new Criterios("tavinho1505");
            System.out.println("Login feito com sucesso!");
        } catch (SenhaInvalidaException e) {
            System.out.println(e.getMessage());
        }
    }
}
