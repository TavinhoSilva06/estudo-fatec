package pacote2;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Circulo meuCirculo = new Circulo();
		Scanner ler = new Scanner(System.in);
		
		meuCirculo.setRaio(50);
		
		System.out.println("Raio do Circulo: " + meuCirculo.getRaio() + "\n" + "Área do Circulo: " + meuCirculo.CalcularArea(0));
	}

}
