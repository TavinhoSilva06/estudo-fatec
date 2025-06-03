package modificadoracesso04;

public class Main4 {
	public static void test() {
		System.out.println("Teste");
	}

	public static void main(String[] args) {
		
		Carro meuCarro = new Carro("Fusca");
		Carro meuCarro1 = new Carro("Sandero");
		Carro meuCarro2= new Carro("BMW");
			
		meuCarro1.acelerar();
		meuCarro2.acelerar();
		meuCarro.acelerar();
	}

}
