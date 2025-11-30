package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import view.frames.FrameCadastro;
import view.frames.FrameLogin;



public class EntrarButtonController implements ActionListener{
    private FrameLogin frameLogin;

    public EntrarButtonController(FrameLogin frameLogin){
        this.frameLogin=frameLogin;
        
    }

    public void actionPerformed(ActionEvent e){
        
        if(frameLogin.getUser().equals("user") && frameLogin.getSenha().equals("2025") ){
            frameLogin.dispose();
            new FrameCadastro();
        }
        else if(frameLogin.getUser().isBlank() || frameLogin.getSenha().isBlank()){
            JOptionPane.showMessageDialog(null,"Campos obrigatórios em branco","Login Inválido",2);
        }
        else{
            JOptionPane.showMessageDialog(null,"Usuário ou senha incorretos","Login Inválido",2);
        }
    }
}
