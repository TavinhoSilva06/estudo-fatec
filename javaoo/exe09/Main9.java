package exe09;

import java.util.Scanner;

public class Main9 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int a = ler.nextInt();
		
		System.out.println("Digite um número: ");
		int b = ler.nextInt();
		
		try {
			double resultado = a / b;
			System.out.println("Resultado: " + resultado);
		} catch (ArithmeticException e) {
			System.out.println("Impossível dividir por zero");
		}
	}
}
