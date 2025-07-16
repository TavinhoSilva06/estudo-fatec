package br.com.alura.ScreenMatch.excecao;

public class ErroDeMinutagemExcepetion extends RuntimeException {
    public String mensagem;

    public ErroDeMinutagemExcepetion(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }
}
