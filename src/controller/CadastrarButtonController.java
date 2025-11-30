package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import model.Produto;
import view.frames.FrameCadastro;

public class CadastrarButtonController implements ActionListener{
    
    private FrameCadastro jFrame;

    public CadastrarButtonController(FrameCadastro jFrame) {
        this.jFrame = jFrame;
    }

    public void actionPerformed(ActionEvent e){
        System.out.println(jFrame.getCodigo().isBlank());
        System.out.println(jFrame.getNome().isBlank());
        System.out.println(jFrame.getCategoria().isBlank());
        System.out.println(Double.parseDouble(jFrame.getPreco()));

        /**
        try {
            String codigo = view.getCodigo();
            String nome = view.getNome();
            String categoria = view.getCategoria();
            double preco = Double.parseDouble(view.getPreco());

            Produto p = new Produto(codigo, nome, categoria, preco);

         
            System.out.println("Produto salvo:\n" + p);

        } catch (Exception exception) {
            view.exibirMensagem("Erro ao salvar: Verifique os dados.");
        }
        */
    }
}
