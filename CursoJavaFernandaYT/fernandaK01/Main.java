package fernandaK01;

public class Main {

	public static void main(String[] args) {
		//byte --> 8 bits --> -128 a 127
		//short --> 16 bits --> -32.768 a 32.767
		//int --> 32 bits --> -2.147.483.648 a 2.147.483.647
		//long --> 64 bits --> -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807
		
		//float --> 32 bits --> precisão simples
		//double --> 64 bits --> precisão dupla
		//String --> representar palavras e frases
		//char --> um único caracter --> 'a'
		//boolean --> true ou false
		
		//DECLARÃO DE VARIÁVEIS
		byte b = 100;
		short s = 10000;
		int i = 100000;
		long l = 100000L;
		float f = 10.5f;
		double d = 20.5;
		char c = 'A';
		String str = "Fernanda";
		boolean bool = false;
		
		//VETORES
		// Posições:                0  1  2  3  4
		int colecaoDeInteiros[] = { 1, 2, 3, 4, 5, 33333};
		int[] meusNumeros = new int[5];
		
		// CONDICIONAIS
		if(str.isBlank()) {
			System.out.println("Verdadeiro");
		} 
		else if (str == "Fernanda") {
			System.out.println(str);
		}
		
		else {
			System.out.println("Falso");
		}
		
		System.out.println(colecaoDeInteiros[5]);
	}

}
