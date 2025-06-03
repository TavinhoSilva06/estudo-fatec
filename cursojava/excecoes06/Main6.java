package excecoes06;

public class Main6 {

	public static void main(String[] args) {
		Carro meuCarro = new Sandero();
		Carro meuCarro2 = new Mobi();
		
		
		SerVivo meuSer = new Humano();
		meuSer.respirar();
		
		meuCarro.acelerar();
		meuCarro2.acelerar();
		
		
		//EXCEÇÕES
		Carro meuCarroFurado = null;
		
		// NullPointerException
		// ArrayOutOfBoundException
		// RuntimeException
		// IDException
		// ArithmeticException
				
		try {
		meuCarroFurado.acelerar();
		} catch (NullPointerException exception) {
			System.out.println("Vende esse carro");
		}
	}

}
