package ExerciciosEclipse.correcaoprova1;
// Qual alternativa define corretamente um método que não recebe parâmetros e não retorna valor?
public class exercicio3 {
    public static int tavinho(int x, int y) {
		return x + y;
	}
	
	public static void helloworld() {
		System.out.println("Hello world");
	}

	public static void main() {
		int A = tavinho(2, 2);
		helloworld();
		System.out.println(A);
	}
}
