package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.frames.FrameCadastro;

public class LimparCadastroController implements ActionListener{
    private FrameCadastro frameCadastro;

    public LimparCadastroController(FrameCadastro frameCadastro){
        this.frameCadastro = frameCadastro;
    }

    public void actionPerformed(ActionEvent e){
        frameCadastro.setCodigo("");
        frameCadastro.setNome("");
        frameCadastro.clearCategoria();
        frameCadastro.setPreco("");
    }
}
