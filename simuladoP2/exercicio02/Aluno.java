package exercicio02;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	
    private String nome;
    private List<Double> notas;

    public Aluno(String constnome) {
        this.nome = constnome;
        this.notas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public List<Double> getNotas() {
        return notas;
    }

    public void adicionarNota(double notanova) {
        notas.add(notanova); // Adiciona uma nota à lista sem substituir as anteriores
    }

    public double calcularMedia() {
        if (notas.isEmpty()) {
            return 0.0;
        }
        double soma = 0.0;
        for (Double nota : notas) {
            soma = soma + nota;
        }
        return soma / notas.size();
    }


    public String toString() {
        return "Aluno: " + nome + ", Notas: " + notas + ", Média: " + calcularMedia();
    }
}
