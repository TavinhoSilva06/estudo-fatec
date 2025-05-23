package exerciciosjava;

public class exercicio08 {

	 public static void main(String[] args) {
	        int resultado = maior(11, 10);
	        System.out.println("O maior número é: " + resultado);
	    }
	    
	    public static int maior(int a, int b) {
	        if (a > b) {
	        	return a;
	        }
	        
	        else {
	        	return b;
	        }
	   }
}