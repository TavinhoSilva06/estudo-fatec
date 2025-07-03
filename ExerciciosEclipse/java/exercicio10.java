package exerciciosjava;

public class Pessoa {

    private String nome;
    private int idade;
    
    public String toString() {
        return "Nome: " + nome + ", Idade: " + idade + " anos";
    }

    public static void main(String[] args) {
        
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Otávio";
        pessoa1.idade = 18;

        Pessoa pessoa2 = new Pessoa();
        pessoa2.nome = "Felipe";
        pessoa2.idade = 30;

        System.out.println("Informações da Pessoa 1: " + pessoa1);

        System.out.println("\nInformações da Pessoa 2: " + pessoa2);
    } 
}