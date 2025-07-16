package ExerciciosCurso4.Parte4.exercicio03;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main3 {
    public static void main(String[] args) {
        Cabecario3 meuCabecario = new Cabecario3("Robert Kirkman", "The Walking Dead", "46", "2004" );
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        String json = gson.toJson(meuCabecario);

        System.out.println(json);
    }
}
