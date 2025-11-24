package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.frames.FrameCadastro;
import view.frames.FrameLogin;

public class EntrarButtonController implements ActionListener{
    private FrameLogin frameLogin;

    public EntrarButtonController(FrameLogin frameLogin){
        this.frameLogin=frameLogin;
    }
    public void actionPerformed(ActionEvent e){
        frameLogin.dispose();
        //new FrameCadastro();

    }
}
