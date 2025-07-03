package exe01;

public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Carro(); // Objeto da classe
        meuCarro.marca = "Toyota";
        meuCarro.modelo = "Corolla";
        meuCarro.ano = 2020;
        
        System.out.println("Marca: " + meuCarro.marca + "\nModelo: " + meuCarro.modelo + "\nAno : " + meuCarro.ano);

    }
}
