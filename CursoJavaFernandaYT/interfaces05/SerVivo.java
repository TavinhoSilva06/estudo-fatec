package interfaces05;

public abstract class SerVivo {
	protected int idade;
	
	public SerVivo(int constIdade) {
		this.idade = constIdade;
	}
	
	public abstract void respirar();
	
	public void dormir() {
		System.out.println("Dormindo...");
	}
	
}
