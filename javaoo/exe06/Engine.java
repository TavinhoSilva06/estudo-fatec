package exe06;

import exe06.VeiculoMotorizado;

public class Engine implements VeiculoMotorizado { // Interface só se conecta com CLASSES
    String marca;
    String modelo;
    
    
    public Engine(String constMarca, String constModelo) {
    	this.marca = constMarca;
    	this.modelo = constModelo;
    }
    
 
 public void ligarMotor() {
	System.out.println("O motor do " + marca + " " + modelo + " está ligado.");
}
 
}
