package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;


import view.frames.ProdutoGUI;

/**
 * Classe responsável por controlar a ação do botão de cadastro.
 * @author João Pedro
 */
public class CadastrarButtonController implements ActionListener{
    
    private ProdutoGUI produtoGUI;

    /**
     * Construtor do CadastrarButtonController.
     * @param produtoGUI Tela de Cadastro
     */
    public CadastrarButtonController(ProdutoGUI produtoGUI) {
        this.produtoGUI = produtoGUI;
    }

    /**
     * Método implementado da interface ActionListener que define o comportamento do botão.
     * @param e ActionEvent
     */
    public void actionPerformed(ActionEvent e){
        
        if(!(ValidarCadastro.validar(produtoGUI.getCodigo(),produtoGUI.getNome(),produtoGUI.getCategoria(),produtoGUI.getPreco()))){
            return;
        }
        
        // Adicionando na Tabela
        produtoGUI.getModel().addRow(new Object[]{
            produtoGUI.getCodigo(),
            produtoGUI.getNome(),
            produtoGUI.getCategoria(),
            produtoGUI.getPreco()
        });

        // Limpando campos
        produtoGUI.setCodigo("");
        produtoGUI.setNome("");
        produtoGUI.clearCategoria();
        produtoGUI.setPreco("");

        // Liberando JSCrollPane
        if(!produtoGUI.getJScrollPane().isVisible()){
            produtoGUI.getJScrollPane().setVisible(true);
        }
        
        // Mensagem de Sucesso
        JOptionPane.showMessageDialog(null,
            "DADOS CADASTRADOS COM SUCESSO!",
            "Cadastro Realizado",
            1);
            
    }
}

