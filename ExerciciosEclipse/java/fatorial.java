package exerciciosjava;

import java.util.Scanner;

public class fatorial {
	
	public static void fatorial(int fatorial, int valor) {
		if (fatorial == 1) {
			return;
		}
		int numeroanterior = fatorial-1;
		int resultado = valor * numeroanterior;
		System.out.printf("Fatorial: %d x %d = %d \n", valor, numeroanterior, resultado);
		fatorial(numeroanterior, resultado);
	}

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int numero = ler.nextInt();
		
		fatorial(numero, numero);
		
	}

}
