package pacote3;

public class ContaBancaria {
	private double saldo;
	private String titular;
	
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double Ssaldo) {
		this.saldo = Ssaldo;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String Stitular) {
		this.titular = Stitular;
	}
	
	public void realizarDeposito(double Svalor) {
		this.saldo = Svalor;
		Svalor = saldo++;
	}
	
	public void realizarSaque(double sacar) {
		if (sacar <= saldo) {
			saldo = saldo - sacar;
		}
		
		else {
			System.out.println("Saldo insuficiente");
		}
	}
}
