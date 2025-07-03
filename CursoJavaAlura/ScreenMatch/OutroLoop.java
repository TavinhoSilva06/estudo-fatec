import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int TotalDeNotas = 0;

        while (nota != -1) {
            System.out.println("Diga a sua nota do filme ou -1 para encerrar: ");
            nota = leitura.nextDouble();

            if(nota != -1) {
                mediaAvaliacao = mediaAvaliacao + nota;
                TotalDeNotas++;
            }
        }

        System.out.println("Media de avaliações: " + mediaAvaliacao/TotalDeNotas);
    }
}
