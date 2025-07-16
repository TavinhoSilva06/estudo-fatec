package ExerciciosCurso4.Parte4.exercicio02;

import com.google.gson.Gson;

public class Main2 {
    public static void main(String[] args) {
        Cabecario meuCabecario = new Cabecario("Robert Kirkman", "The Walking Dead", "46", "2004" );
        Gson gson = new Gson();

        String json = gson.toJson(meuCabecario);

        System.out.println(json);
    }
}
