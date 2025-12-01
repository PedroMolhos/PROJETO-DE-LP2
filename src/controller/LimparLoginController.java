package controller;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.frames.LoginGUI;

/**
 * Classe responsável por controlar a ação do botão de Limpar da Tela de Login.
 * @author João Pedro
 */
public class LimparLoginController implements ActionListener{
    private LoginGUI frameLogin;

    /**
     * Construtor do LimparLoginController.
     * @param loguinGui Tela de Login
     */
    public LimparLoginController(LoginGUI frameLogin){
        this.frameLogin=  frameLogin;

    }

    /**
     * Método implementado da interface ActionListener que define o comportamento do botão. 
     * @param e ActionEvent
     */
    public void actionPerformed(ActionEvent e){ 
        frameLogin.setUser("");
        frameLogin.setSenha("");
    }

}
