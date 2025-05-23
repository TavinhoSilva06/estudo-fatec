package exerciciosjava;

import java.util.Scanner;

public class exercicio07 {

	public static void main(String[] args) {
		int i;
		int soma = 0;
		int vetor[] = new int[5];
		
		Scanner ler;
		ler = new Scanner(System.in);
		
		for (i=0; i <= 4; i++) {
			System.out.println("Digite um número: ");
			vetor[i] = ler.nextInt(); 	
			soma = soma + vetor[i]; 
		}
		System.out.println("Soma dos números: " + soma);
	}
}