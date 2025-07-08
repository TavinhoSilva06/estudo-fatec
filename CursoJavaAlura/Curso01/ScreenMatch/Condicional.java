public class Condicional {
    public static void main(String[] args) {
        int AnoDeLancamento = 1990;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "plus";

        if (AnoDeLancamento >= 2022) {
            System.out.println("Lnaçamentos que os clientes estão curtindo!");
        } else {
            System.out.println("Filme retrô que vale a pena assistir!");
        }

        if (incluidoNoPlano == true && tipoPlano.equals("plus")) { // && = E // || = OU
            System.out.println("Filme liberado");
        } else {
            System.out.println("Deve pagar a locação");
        }
    }
}
