package ExerciciosCurso2.Parte2.exercicio02;

public class IdadePessoa {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void VerificarIdade() {
        if (idade < 18) {
            System.out.println(nome + " não é maior de idade");
        }

        else {
            System.out.println(nome + " é maior de idade");
        }
    }
}
