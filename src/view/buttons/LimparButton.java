package view.buttons;

import java.awt.event.ActionListener;

import javax.swing.JButton;

public class LimparButton extends JButton{

    public LimparButton(ActionListener actionListener){
        this.setText("Limpar Dados");
        this.addActionListener(actionListener);
    }
}
