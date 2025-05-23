package exe05;


public class Moto5 extends Veiculo5 {
    private int cilindradas;
    
    public Moto5(String constmarca, int constano, int constcilindradas) {
    	super(constmarca, constano); // O super chama o construtor da classe PRINCIPAL
        this.cilindradas = constcilindradas;
    }
    
    @Override
    public void exibirDetalhes() {
        System.out.println("Detalhes da moto: marca, ano e cilindradas: " + marca + " " + ano + " " + cilindradas);
    }
}
