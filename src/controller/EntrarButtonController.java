package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import view.frames.ProdutoGUI;
import view.frames.LoginGUI;



public class EntrarButtonController implements ActionListener{
    private LoginGUI loguinGui;

    public EntrarButtonController(LoginGUI loguinGui){
        this.loguinGui=loguinGui;
        
    }

    public void actionPerformed(ActionEvent e){
        
        if(loguinGui.getUser().equals("user") && loguinGui.getSenha().equals("2025") ){
            loguinGui.dispose();
            new ProdutoGUI();
        }
        else if(loguinGui.getUser().isBlank() || loguinGui.getSenha().isBlank()){
            JOptionPane.showMessageDialog(null,"Campos obrigatórios em branco","Login Inválido",2);
        }
        else{
            JOptionPane.showMessageDialog(null,"Usuário ou senha incorretos","Login Inválido",2);
        }
    }
}
