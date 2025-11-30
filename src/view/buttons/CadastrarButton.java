package view.buttons;

import java.awt.event.ActionListener;

import javax.swing.JButton;

public class CadastrarButton extends JButton{

    public CadastrarButton(ActionListener actionlistener){
        this.setText("Cadastrar");
        this.addActionListener(actionListener);
    }
}
