package correcaoprova1;
// O que ocorre durante a compilação?
public class exercicio1 {
    
	public static void main(String[] args) {
		int x = 10;
		if (x > 5) {
			int y = 20;
			// System.out.println(y);
		}
		// System.out.println(y); // Vai dar erro de compilação, por que o y funciona APENAS dentro do escopo do if.
	}
}
