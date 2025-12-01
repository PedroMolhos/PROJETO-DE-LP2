package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;


import view.frames.ProdutoGUI;


public class CadastrarButtonController implements ActionListener{
    
    private ProdutoGUI produtoGUI;
 ;
    public CadastrarButtonController(ProdutoGUI produtoGUI) {
        this.produtoGUI = produtoGUI;
    }

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

