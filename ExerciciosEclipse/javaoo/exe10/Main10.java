package exe10;

import java.util.ArrayList;

public class Main10 {
    public static void main(String[] args) {

        ArrayList<Carro10> listaCarros = new ArrayList<>();
        
        listaCarros.add(new Carro10("Toyota", "Corolla", 2020));
        listaCarros.add(new Carro10("Honda", "Civic", 2021));
        
        System.out.println(listaCarros);
        
        for (Carro10 carro : listaCarros) {
        	carro.imprimir();
        }
    }
}
