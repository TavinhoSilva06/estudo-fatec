package ExerciciosCurso4.Parte3.exercicio01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int n1 = leitura.nextInt();

        System.out.println("Digite o segundo número: ");
        int n2 = leitura.nextInt();

        try {
            double divisao = (double) n1 / n2;
            System.out.println("Resultado da divisão: " + divisao);
        } catch (ArithmeticException e) {
            System.out.println("Impossível dividir por 0");
        }
    }
}
