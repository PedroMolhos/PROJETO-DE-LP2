package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;



public class EntrarButtonController implements ActionListener{
    private JFrame JFrame;
    private JTextField user;
    private JTextField senha;

    public EntrarButtonController(JFrame JFrame, JTextField user, JTextField senha){
        this.JFrame=JFrame;
        this.user = user;
        this.senha = senha;
        
    }

    public void actionPerformed(ActionEvent e){
        
        if(user.getText().equals("user") && senha.getText().equals("2025") ){
            JFrame.dispose();
            // TO DO: add FrameCadastro
        }
        else{
            JOptionPane.showMessageDialog(null,"Usuário ou Senha incorretos","Erro",2);
        }
    }
}
