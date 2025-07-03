package exe02;

import java.util.ArrayList;
import java.util.Scanner;


public class Main2 {
    public static void main(String[] args) {
    	
        Carro2 meuCarro = new Carro2();
        meuCarro.marca = "Toyota";
        meuCarro.modelo = "Corolla";
        meuCarro.ano = 2020;
        
        String marcaRetornada = meuCarro.getMarca();
        System.out.println("Marca: " + marcaRetornada);
        meuCarro.setMarca("Audi");
        meuCarro.setMarca("Ford");
        System.out.println("Marca: " + meuCarro.marca);
        
        
        String modeloRetornada = meuCarro.getModelo();
        System.out.println("Modelo: " + modeloRetornada);
        meuCarro.setModelo("Mustang");
        System.out.println("Modelo: " + meuCarro.modelo);
        
        
        int anoRetornada = meuCarro.getAno();
        System.out.println("Ano: " + anoRetornada);
        meuCarro.setAno(1998);
        System.out.println("Ano: " + meuCarro.ano);
        
    }
}

