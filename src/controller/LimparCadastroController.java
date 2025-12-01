package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.frames.ProdutoGUI;

/**
 * Classe responsável por controlar a ação do botão de Limpar da Tela de Cadastro.
 * @author João Pedro
 */
public class LimparCadastroController implements ActionListener{
    private ProdutoGUI produtoGUI;

    /**
     * Construtor do LimparCadastroController.
     * @param produtoGUI Tela de Cadastro
     */
    public LimparCadastroController(ProdutoGUI produtoGUI){
        this.produtoGUI = produtoGUI;
    }

    /**
     * Método implementado da interface ActionListener que define o comportamento do botão.
     * @param e ActionEvent
     */
    public void actionPerformed(ActionEvent e){
        produtoGUI.setCodigo("");
        produtoGUI.setNome("");
        produtoGUI.clearCategoria();
        produtoGUI.setPreco("");
    }
}
