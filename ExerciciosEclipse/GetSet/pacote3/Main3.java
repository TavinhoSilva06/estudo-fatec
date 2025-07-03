package pacote3;

public class Main3 {

	public static void main(String[] args) {
		ContaBancaria banco = new ContaBancaria();
		
		banco.setTitular("Bradesco");
		System.out.println("Título do banco: " + banco.getTitular());
		
		banco.setSaldo(100);
		System.out.println("Saldo: " + banco.getSaldo());
		
		banco.realizarDeposito(300);
		System.out.println("Saldo após o depósito: " + banco.getSaldo());
		
		banco.realizarSaque(299);
		System.out.println("Saldo após fazer o saque: " + banco.getSaldo());
	}

}
