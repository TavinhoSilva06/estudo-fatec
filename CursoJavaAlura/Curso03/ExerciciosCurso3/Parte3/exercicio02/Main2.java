package ExerciciosCurso3.Parte3.exercicio02;

import br.com.alura.ScreenMatch.modelos.Filme;

public class Main2 {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();

        Animal animal = (Animal) cachorro;
        double idade = 19;
        int idadeConvertida = (int) idade;

        cachorro.FazerBarulho();
    }
}
