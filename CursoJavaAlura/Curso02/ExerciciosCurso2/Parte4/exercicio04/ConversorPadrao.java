package ExerciciosCurso2.Parte4.exercicio04;

public class ConversorPadrao implements ConversorTemperatura {

    double celsius;
    double fahrenheit;
    double resultado;

    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    public double getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    @Override
    public double celsiusParaFahrenheit() {
        resultado = celsius * 1.8 + 32;
        return resultado;
    }

    @Override
    public double fahrenheitParaCelsius() {
        resultado = (fahrenheit - 32) / 1.8;
        return resultado;
    }
}
