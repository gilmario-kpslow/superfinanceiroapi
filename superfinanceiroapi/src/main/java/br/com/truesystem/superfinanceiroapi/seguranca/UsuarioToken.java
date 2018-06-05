package br.com.truesystem.superfinanceiroapi.seguranca;

import java.io.Serializable;

/**
 *
 * @author gilmario
 */
public class UsuarioToken implements Serializable {

    private String token;
    private String username;
    private String nome;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
