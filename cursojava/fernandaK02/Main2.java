package fernandaK02;

import java.util.ArrayList;

public class Main2 {

	public static void main(String[] args) {
		/*byte b = 100;
		short s = 10000;
		int i = 100000;
		long l = 100000L;
		float f = 10.5f;
		double d = 20.5;
		char c = 'A';
		String str = "Fernanda";
		boolean bool = false;
		*/
		
		String[] nomesArr = new String[10];
		
		//ARRAYLIST
		ArrayList<String> nomes = new ArrayList<>();
		nomes.add("Fernanda");
		nomes.add("Leo");
		nomes.add("Joao");
		nomes.add("Maria");
		
		/*System.out.println(nomes.get(0));
		
		nomes.remove(0);
		nomes.remove("Leo");
		System.out.println(nomes.get(0));*/
		
		//LAÇÕS DE REPETIÇÕES ( LOOPS )
		for(int meuIterador = 0; meuIterador < nomesArr.length; meuIterador++) {
			System.out.println(nomesArr[meuIterador]);
		}
		
		for(String nome : nomes) {
			System.out.println(nome);
		}
		
		
		int contador = 0;
		while(contador < 10) {
			System.out.println("Estou no while");
			contador++;
		}
		
		
		//CASTING
		
		//Explicito
		double resultado = 0.0;
		int resultadoInt = (int) resultado;
		
		//NÃO EXPLICITO
		int meuInt = 10;
		double meuDouble = meuInt;
		
		//Transformando String em um Int
		String meuString = "10";
		int meuInt2 = Integer.parseInt(meuString);
		
		//Transformando um Int em uma String
		String minhaString = String.valueOf(meuInt2);
	}

}
