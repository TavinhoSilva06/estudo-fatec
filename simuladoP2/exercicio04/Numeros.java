package exercicio04;

import java.util.ArrayList;
import java.util.List;

public class Numeros {
	private List<Integer> num;
		
	public Numeros() {
		this.num = new ArrayList<>();
	}
	
	public void adicionarNum(int novoNumero) {
        num.add(novoNumero); 
    }
	
	 public void exibirNumeros() {
	        System.out.println("Números: " + num);
	    }

}
