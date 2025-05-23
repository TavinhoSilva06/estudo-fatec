package exerciciosjava;

import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {
		int n1;
		int n2;
		int soma;
		int multiplicar;
		int dividir;
		
		Scanner scanner;
		scanner = new Scanner(System.in);
		
		
		System.out.println("Digite um número: ");
		n1 = scanner.nextInt();
		
		System.out.println("Digite um número: ");
		n2 = scanner.nextInt();
		
		soma = n1 + n2;
		multiplicar = n1 * n2;
		dividir = n1/n2;
		
		System.out.println(soma);
		System.out.println(multiplicar);
		System.out.println(dividir);
		
	}

}