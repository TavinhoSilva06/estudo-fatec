package ExerciciosCurso2.Parte2.exercicio01;

public class Main {
    public static void main(String[] args) {
        ContaBancaria meuBanco = new ContaBancaria();

        meuBanco.titular = "Otávio Augusto";
        meuBanco.setNumeroConta("12345678-9");
        meuBanco.setSaldo(2500.50);

        System.out.println("Nome titular da conta: " + meuBanco.titular + "\nNúmero da conta: " + meuBanco.getNumeroConta() + "\nSaldo atual: " + meuBanco.getSaldo());

    }
}
