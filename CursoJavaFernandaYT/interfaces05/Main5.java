package interfaces05;

public class Main5 {

	public static void main(String[] args) {
		Carro meuCarro = new Sandero();
		Carro meuCarro2 = new Mobi();
		
		
		SerVivo meuSer = new Humano();
		meuSer.respirar();
		
		meuCarro.acelerar();
		meuCarro2.acelerar();
		
	}

}
