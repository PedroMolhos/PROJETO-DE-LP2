package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JTextField;

public class LimparButtonController implements ActionListener{
    private ArrayList<JTextField> textFields;

    public LimparButtonController(ArrayList<JTextField> textFields){
        this.textFields=textFields;
    }

    public void actionPerformed(ActionEvent e){
        for(JTextField t:textFields){
            t.setText("");
        }
    }

}
