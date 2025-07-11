package ExerciciosCurso3.Parte4.exercicio03;

public class Titulos implements Comparable<Titulos> {
    private String nome;

    public Titulos(String nome) {
        this.nome = nome;
    }

    public String getNomes() {
        return nome;
    }

    @Override
    public int compareTo(Titulos outrosTitulos) {
        return this.getNomes().compareTo(outrosTitulos.getNomes());
    }

    @Override
    public String toString() {
        return "Titulos{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
