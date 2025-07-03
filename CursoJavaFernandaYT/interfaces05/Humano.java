package interfaces05;

public class Humano extends SerVivo {
	
	public String nome;
	
	public Humano() {
		super(42);
		this.nome = "Fernanda";	
	}

	@Override
	public void respirar() {
		System.out.println("Transformando em oxigênio");
		
	}

	// @Override
	/*public void respirar() {
		System.out.println(this.idade);
		System.out.println("Inalando e exalando CO2	e Oxigênio");
	}*/
	
}
