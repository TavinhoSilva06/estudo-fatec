package ExerciciosCurso4.Parte4.exercicio04;

import ExerciciosCurso4.Parte4.exercicio03.Cabecario3;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main4 {
    public static void main(String[] args) {
        Veiculo meuVeiculo = new Veiculo();
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        meuVeiculo.setMarca("Honda");
        meuVeiculo.setModelo("CBR 1000RR Fireblade");
        meuVeiculo.setVelocidadeMaxima(290);

        String json = gson.toJson(meuVeiculo);

        System.out.println(json);
    }
}
