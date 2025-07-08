package ExerciciosCurso2.Parte4.exercicio04;

public class Main4 {
    public static void main(String[] args) {
        ConversorPadrao conversor = new ConversorPadrao();

        conversor.setCelsius(36);
        conversor.setFahrenheit(50);

        System.out.println("Temperatura em graus Celsius: " + conversor.getCelsius() + "C");
        System.out.println("Temperatura em graus Fahrenheit: " + conversor.getFahrenheit() + "F");

        System.out.println("Celsius para Fahrenheit: " + conversor.celsiusParaFahrenheit());
        System.out.println("Fahrenheit para Celsius: " + conversor.fahrenheitParaCelsius());
    }
}
