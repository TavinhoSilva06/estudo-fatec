package exerciciosjava;

import java.util.Scanner;

public class exercicio09 {

	public static void main(String[] args) {
		Scanner ler; 
		ler = new Scanner(System.in);
		
		String palavra = null;
		// [ 0 ] = f
		// [ 1 ] = e
		// [ 2 ] = l
		// [ 3 ] = i
		// [ 4 ] = p
		// [ 5 ] = e
		// charArray.length, começa contando de 1, não de 0 como em vetores.
		
		
		System.out.println("Digite uma palavra: ");
		palavra = ler.next();
		
		char[] charArray = palavra.toCharArray();
		System.out.println("Tamanho do array: " + charArray.length);
		
		for (int i = charArray.length-1; i >= 0; i--) {
			System.out.println(charArray[i]);
			System.out.println("Indice: " + i);
		}

	}

}
