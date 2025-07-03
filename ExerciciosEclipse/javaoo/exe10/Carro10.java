package exe10;

public class Carro10 {
	String marca;
    String modelo;
    int ano;
    public Carro10(String constmarca, String constmodelo, int constano) {
    	this.marca = constmarca;
    	this.modelo = constmodelo;
    	this.ano = constano;
	}
    
    public void imprimir() {
        System.out.println(marca + " " + modelo + " " + ano);
    }
    
    public String toString() {
        return "Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + ano;
    }

 
}
