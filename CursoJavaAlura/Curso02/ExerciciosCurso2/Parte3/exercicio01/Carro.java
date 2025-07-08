package ExerciciosCurso2.Parte3.exercicio01;

import br.com.alura.ScreenMatch.modelos.Filme;

public class Carro {
    private int PrecoAno1;
    private int PrecoAno2;
    private int PrecoAno3;
    private String nomeCarro;
    private String modelo;

    public String getNomeCarro() {
        return nomeCarro;
    }

    public void setNomeCarro(String nomeCarro) {
        this.nomeCarro = nomeCarro;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPrecoAno1() {
        return PrecoAno1;
    }

    public void setPrecoAno1(int precoAno1) {
        PrecoAno1 = precoAno1;
    }

    public int getPrecoAno2() {
        return PrecoAno2;
    }

    public void setPrecoAno2(int precoAno2) {
        PrecoAno2 = precoAno2;
    }

    public int getPrecoAno3() {
        return PrecoAno3;
    }

    public void setPrecoAno3(int precoAno3) {
        PrecoAno3 = precoAno3;
    }

    private double calcularMenorPreco() {
        double menorPreco = PrecoAno1;

        if (PrecoAno2 < menorPreco) {
            menorPreco = PrecoAno2;
        }

        if (PrecoAno3 < menorPreco) {
            menorPreco = PrecoAno3;
        }

        return menorPreco;
    }

    private double calcularMaiorPreco() {
        double maiorPreco = PrecoAno1;

        if (PrecoAno2 > maiorPreco) {
            maiorPreco = PrecoAno2;
        }

        if (PrecoAno3 > maiorPreco) {
            maiorPreco = PrecoAno3;
        }

        return maiorPreco;
    }


    public void ExibirDetalhes() {
        System.out.println("Nome do carro: " + nomeCarro);
        System.out.println("Modelo do carro: " + modelo);
        System.out.println("Preço médio do ano 1: " + PrecoAno1);
        System.out.println("Preço médio do ano 2: " + PrecoAno2);
        System.out.println("Preço médio do ano 3: " + PrecoAno3);
        System.out.println("Menor preço: " + calcularMenorPreco());
        System.out.println("Maior preço: " + calcularMaiorPreco());
    }
}
