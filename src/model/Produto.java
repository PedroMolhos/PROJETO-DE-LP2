package model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Classe responsável por representar um Produto.
 * @author João Pedro
 */
public class Produto implements Serializable{

    private long codigo;
    private String nome;
    private String categoria;
    private double preco;
    public static ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
    
    /**
     * Construtor do Produto.
     * @param codigo codigo que identifica o produto.
     * @param nome nome do produto.
     * @param categoria categoria do produto.
     * @param preco preço do produto.
     */
    public Produto(long codigo, String nome, String categoria, double preco) {
        setCodigo(codigo);
        setNome(nome);
        setCategoria(categoria);
        setPreco(preco);
    }

    /**
     * Método para obter o Codigo de um Produto.
     * @return long
     */
    public long getCodigo() {
        return codigo;
    }

    /**
     * Método para definir o Código de um Produto.
     * @param codigo Código do produto. 
     */
    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    /**
     * Método para obter o Nome de um Produto.
     * @return String
     */
    public String getNome() {
        return nome;
    }

    /**
     * Método para definir o Nome de um Produto.
     * @param nome Nome do produto. 
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Método para obter a Categoria de um Produto.
     * @return String
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * Método para definir o Categoria de um Produto.
     * @param categoria Categoria do produto. 
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * Método para obter o Preço de um Produto.
     * @return double
     */
    public double getPrecoUnitario() {
        return preco;
    }

    /**
     * Método para definir o Preço de um Produto.
     * @param preco Preço do produto. 
     */
    public void setPreco(double preco) {
        this.preco = preco;
    }

    /**
     * Método para obter a String formatada que representa um Produto.
     * @return String
     */
    @Override
    public String toString() {
        return  "[ "+ codigo + " / " + nome +" / " + categoria + " / R$" + preco +" ]";
                
    }
}