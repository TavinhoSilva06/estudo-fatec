package ExerciciosCurso2.Parte4.exercicio01;

public class ConversorMoeda implements ConversaoFinanceira {
    @Override
    public void converterDolarParaReal(double valor) {
        double cotacaoDolar = 5.46;
        double valorReal = valor * cotacaoDolar;
        System.out.println("O valor em reais é: R$" + valorReal);
    }
}
