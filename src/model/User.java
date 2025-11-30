package model;

public class User {
    private String usuario;
    private String senha;

    public User(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    public String getUsuario() { return usuario; }
    public String getSenha() { return senha; }
}
