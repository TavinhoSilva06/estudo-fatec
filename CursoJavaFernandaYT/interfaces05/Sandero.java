package interfaces05;

public class Sandero implements Carro {
	
	final int limiteDeVelocidade = 150;
	// Variáveis do tipo final, elas não podem ser atualizadas e nem redefinidas
	
	public int velocidadeAtual = 0;

	@Override
	public void acelerar() {
		if(this.velocidadeAtual <= this.limiteDeVelocidade) {
			this.velocidadeAtual += 10;
			// this.velocidadeAtual = velocidadeAtual + 10;
			System.out.println("Acelerando");
		}
		System.out.println("Velocidade atual: " + this.velocidadeAtual);
	}

	@Override
	public void freiar() {
		
	}

	@Override
	public void parar() {
		
		
	}
	
}
