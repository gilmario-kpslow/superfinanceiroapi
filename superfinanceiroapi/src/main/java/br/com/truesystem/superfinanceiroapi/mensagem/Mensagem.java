package br.com.truesystem.superfinanceiroapi.mensagem;

/**
 *
 * @author gilmario
 */
public class Mensagem {

    private String titulo;
    private String descricao;

    public Mensagem() {
    }

    public Mensagem(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
