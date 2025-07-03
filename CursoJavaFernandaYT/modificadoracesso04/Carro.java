package modificadoracesso04;

public class Carro {
		String modelo;
		
		//Construtor
		public Carro(String constModelo) {
				this.modelo = constModelo;
			}
		
		//Métodos
		public void acelerar() {
			System.out.println("Acelerando o carro " + this.modelo);
			}
		
		public String test() {
			System.out.println("ooiii");
			return "oi";
			}
		
		// Métodos do tipo private só estarão disponíveis a serem utilizados dentro da própria classe onde foram criados
		// e métodos private não irão funcionar mesmo criando outra classe no mesmo arquivo.
		
		// Métodos do tipo protected funcionam quando estão no mesmo pacote.
		
		// Métodos do tipo default são quando não defino nenhum modificador de acesso ( tipo da classe ).
}

class rodas {
	public rodas() {
		Carro carro = new Carro("kdkd");
		carro.acelerar();
	}
}
