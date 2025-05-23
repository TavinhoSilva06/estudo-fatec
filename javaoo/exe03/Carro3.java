package exe03;


public class Carro3 {
    String marca;
    String modelo;
    int ano;
     
public Carro3(String constmarca, String constmodelo, int constano) { // Construtor para transformar a classe em objeto.
        this.marca = constmarca;
        this.modelo = constmodelo;
        this.ano = constano;
    }

 public void imprimir() {
        System.out.println(marca + " " + modelo + " " + ano);
    }
 
}
