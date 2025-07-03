package pacote;

public class Main {

	public static void main(String[] args) {
		Livro meuLivro = new Livro();
		
		meuLivro.setTitulo("Olhos cansados");
		meuLivro.setAutor("Otávio Augusto");
		meuLivro.setAnoPublicação(2025);
		
		System.out.println("Título: " + meuLivro.getTitulo() + "\n" + "Autor: " + meuLivro.getAutor() + "\n" + "Ano da públicação: " + meuLivro.getAnoPublicação());

	}

}
