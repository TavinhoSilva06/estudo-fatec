package ExerciciosCurso2.Parte4.exercicio02;

public class CalcularSalaRetangular implements CalculoGeometrico {

    @Override
    public void calcularArea(int altura, int largura) {
        int area = largura * altura;
        System.out.println("A área do retângulo é: " + area);
    }

    @Override
    public void calcularPerimetro(int altura, int largura) {
        int perimetro = 2 * (largura + altura);
        System.out.println("O perímetro do retângulo é: " + perimetro);
    }
}
