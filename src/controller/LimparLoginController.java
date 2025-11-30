package controller;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.frames.FrameLogin;


public class LimparLoginController implements ActionListener{
    private FrameLogin frameLogin;

    public LimparLoginController(FrameLogin frameLogin){
        this.frameLogin=  frameLogin;

    }

    public void actionPerformed(ActionEvent e){ 
        frameLogin.setUser("");
        frameLogin.setSenha("");
    }

}
