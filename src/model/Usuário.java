package model;

/**
 * Classe responsável por representar um Usuário.
 * @author João Pedro
 */
public class Usuário {
    private String usuario;
    private String senha;

    /**
     * Construtor do Usuário.
     * @param usuario usuário de login.
     * @param senha senha do usuário.
     */
    public Usuário(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    /**
     * Método para obter o usuário do Usuário.
     * @return usuario
     */
    public String getUsuario(){ 
        return usuario;
    }

    /**
     * Método para obter a senha do Usuário.
     * @return senha
     */
    public String getSenha(){ 
        return senha;
    }
}
