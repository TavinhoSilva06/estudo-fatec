package ExerciciosCurso2.Parte3.exercicio01;

public class ModeloCarro extends Carro{
    private int Potencia;
    private int KmRodados;
    private double Consumo;

    public int getPotencia() {
        return Potencia;
    }

    public void setPotencia(int potencia) {
        Potencia = potencia;
    }

    public int getKmRodados() {
        return KmRodados;
    }

    public void setKmRodados(int kmRodados) {
        KmRodados = kmRodados;
    }

    public double getConsumo() {
        return Consumo;
    }

    public void setConsumo(double consumo) {
        Consumo = consumo;
    }

    @Override
    public void ExibirDetalhes() {
        System.out.println("Potência do carro: " + Potencia);
        System.out.println("Quilômetros rodados: " + KmRodados);
        System.out.println("Consumo de combústível: " + Consumo + "km por litro");
    }
}
