package ExerciciosCurso4.Parte4.exercicio01;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileWriter escrita = null;
        try {
            escrita = new FileWriter("arquivo.txt");
            escrita.write("Conteúdo a ser gravado no arquivo");
            escrita.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
