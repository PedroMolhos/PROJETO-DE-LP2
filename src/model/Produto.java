package model;

import java.io.Serializable;
import java.util.ArrayList;

public class Produto implements Serializable{

    private long codigo;
    private String nome;
    private String categoria;
    private double preco;
    public static ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
    
    public Produto(long codigo, String nome, String categoria, double preco) {
        setCodigo(codigo);
        setNome(nome);
        setCategoria(categoria);
        setPreco(preco);
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPrecoUnitario() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return  "[ "+ codigo + " / " + nome +" / " + categoria + " / R$" + preco +" ]";
                
    }
}