package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import view.frames.ProdutoGUI;

public class CadastrarButtonController implements ActionListener{
    
    private ProdutoGUI produtoGUI;

    public CadastrarButtonController(ProdutoGUI produtoGUI) {
        this.produtoGUI = produtoGUI;
    }

    public void actionPerformed(ActionEvent e){
        if(!(produtoGUI.getCodigo().isBlank()) && !(produtoGUI.getNome().isBlank()) &&
        !(produtoGUI.getCategoria().isBlank()) && !(produtoGUI.getPreco().isBlank())){
            
            produtoGUI.getModel().addRow(new Object[]{
                produtoGUI.getCodigo(),
                produtoGUI.getNome(),
                produtoGUI.getCategoria(),
                produtoGUI.getPreco()
            });

            produtoGUI.setCodigo("");
            produtoGUI.setNome("");
            produtoGUI.clearCategoria();
            produtoGUI.setPreco("");

            if(!produtoGUI.getJScrollPane().isVisible()){
                produtoGUI.getJScrollPane().setVisible(true);
            }
            
            JOptionPane.showMessageDialog(null,"DADOS CADASTRADOS COM SUCESSO!","Cadastro Realizado",1);

        }
        else{
            JOptionPane.showMessageDialog(null,"Campos obrigatórios não preenchidos", "Cadastro não Realizado",0);
        }
        
    }
}
