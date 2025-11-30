package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.frames.ProdutoGUI;

public class LimparCadastroController implements ActionListener{
    private ProdutoGUI produtoGUI;

    public LimparCadastroController(ProdutoGUI produtoGUI){
        this.produtoGUI = produtoGUI;
    }

    public void actionPerformed(ActionEvent e){
        produtoGUI.setCodigo("");
        produtoGUI.setNome("");
        produtoGUI.clearCategoria();
        produtoGUI.setPreco("");
    }
}
