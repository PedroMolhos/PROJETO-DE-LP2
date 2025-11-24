package view.buttons;

import java.awt.event.ActionEvent;

import javax.swing.JButton;

public class CadastrarButton extends JButton{

    public CadastrarButton(ActionEvent actionlistener){
        this.setText("Cadastrar");
        this.addActionListener(actionListener);
    }
}
