package model;


public class Produto {

    private String codigo;
    private String nome;
    private String categoria;
    private double preco;

    public Produto(String codigo, String nome, String categoria, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Código: " + codigo +
                "\nNome: " + nome +
                "\nCategoria: " + categoria +
                "\nPreço: R$ " + preco;
    }
}