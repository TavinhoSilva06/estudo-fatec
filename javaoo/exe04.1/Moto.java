package exe04_1;

// EXERCICIO 04
public class Moto extends Veiculo {
    int cilindradas;
    
    public Moto(String constmarca, int constano, int constcilindradas) {
        this.marca = constmarca;
        this.ano = constano;
        this.cilindradas = constcilindradas;
    }
    
    @Override
    public void exibirInfo() {
        System.out.println(marca + " " + ano + " " + cilindradas + "cc");
    }
   
}
