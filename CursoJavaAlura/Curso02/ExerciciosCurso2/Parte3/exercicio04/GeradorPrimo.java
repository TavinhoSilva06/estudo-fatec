package ExerciciosCurso2.Parte3.exercicio04;

public class GeradorPrimo extends NumerosPrimos {

    public int gerarProximoPrimo(int ultimoPrimoConhecido) {
        int proximoNumero = ultimoPrimoConhecido + 1;

        while (!verificarPrimalidade(proximoNumero)) {
            proximoNumero++;
        }
        return proximoNumero;
    }
}
