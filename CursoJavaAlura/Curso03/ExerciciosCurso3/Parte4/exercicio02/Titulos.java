package ExerciciosCurso3.Parte4.exercicio02;

public class Titulos implements Comparable<Titulos> {
    private String nome;

    public String getNomes() {
        return nome;
    }

    @Override
    public int compareTo(Titulos outrosTitulos) {
        return this.getNomes().compareTo(outrosTitulos.getNomes());
    }
}
