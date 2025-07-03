package exe04;

public class Main4 {

	public static void main(String[] args) {
		Veiculo MeuVeiculo = new Veiculo();
		MeuVeiculo.marca = "Honda";
		MeuVeiculo.ano = 2020;
		
		Moto MinhaMoto = new Moto("BMW", 2010, 10);
		//MinhaMoto.cilindradas = 50;
		MinhaMoto.exibirInfo();
	}

}
