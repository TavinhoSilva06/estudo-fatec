package exerciciosjava;

import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {
		int n;
		
		Scanner scanner;
		scanner = new Scanner(System.in);
		
		
		System.out.println("Digite um número: ");
		n = scanner.nextInt();
		
		if (n % 2 == 0) {
			System.out.println("É par");
		}
		
		else {
			System.out.println("É impar");
		}
		
	}

}