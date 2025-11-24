package view.buttons;

import java.awt.event.ActionListener;

import javax.swing.JButton;

public class EntrarButton extends JButton{
    
    public EntrarButton(ActionListener actionlistener){
        this.setText("Entrar");
        this.addActionListener(actionlistener);
    }
}
