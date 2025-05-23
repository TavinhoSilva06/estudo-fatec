package exe08_ignore;

public class Contar {
	
	 private static int contador = 0;
	 private final String tipo = "Veículo";
	 
	 public Contar() {
	 	contador++;
	 }

	 
	 public static int getContador() {
	 	return contador;
	 }
	 
	 public String getTipo() {
	 	return tipo;
	 }
	 
}
