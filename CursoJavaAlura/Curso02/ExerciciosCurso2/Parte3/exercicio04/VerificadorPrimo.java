package ExerciciosCurso2.Parte3.exercicio04;

public class VerificadorPrimo extends NumerosPrimos {

    public void verificarSeEhPrimo(int numero) {
        if (verificarPrimalidade(numero)) {
            System.out.println(numero + " é primo.");
        } else {
            System.out.println(numero + " não é primo.");
        }
    }
}
