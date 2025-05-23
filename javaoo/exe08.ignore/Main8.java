package exe08_ignore;

public class Main8 {

	public static void main(String[] args) {
		Contar meuContador = new Contar();
       
		for(int i = 0; i <= 5; i++) {
        int ContadorRetornado = meuContador.getContador();
        System.out.println("Contador: " + ContadorRetornado);
       
        String TipoRetornado = meuContador.getTipo();        
        System.out.println("Tipo: " + TipoRetornado);
		}

	}

}
