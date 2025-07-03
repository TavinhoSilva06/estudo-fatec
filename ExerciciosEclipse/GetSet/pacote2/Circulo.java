package pacote2;

public class Circulo {
	private double raio;

	public double getRaio() {
		return raio;
	}

	public void setRaio(double Sraio	) {
		this.raio = Sraio;
	}
	
	public double CalcularArea(double area) {
		area = 3.14 * (raio * raio);
		return area;
	}
}
