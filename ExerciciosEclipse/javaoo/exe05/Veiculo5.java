package exe05;

public class Veiculo5 {
	protected String marca;
	protected int ano;

	
	public Veiculo5(String constMarca, int constAno) {
		this.marca = constMarca;
		this.ano = constAno;
	}

public void exibirDetalhes() {
    System.out.println("Detalhes do veículo: " + marca + " " + ano);
}

}