package orientadaobjeto03;

public class Main3 {
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
	
class Carro {
	String modelo;
	
	//Construtor
	public Carro(String constModelo) {
			this.modelo = constModelo;
		}
	
	//Método
	public void acelerar() {
		System.out.println("Acelerando o carro " + this.modelo);
		}
	
	public String test() {
		System.out.println("ooiii");
		return "oi";
		}
	}

