package controller;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.frames.LoginGUI;


public class LimparLoginController implements ActionListener{
    private LoginGUI frameLogin;

    public LimparLoginController(LoginGUI frameLogin){
        this.frameLogin=  frameLogin;

    }

    public void actionPerformed(ActionEvent e){ 
        frameLogin.setUser("");
        frameLogin.setSenha("");
    }

}
