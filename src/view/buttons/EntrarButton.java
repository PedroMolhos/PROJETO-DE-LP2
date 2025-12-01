package view.buttons;

import java.awt.event.ActionListener;

import javax.swing.JButton;

/**
 * Classe responsável por representar o botão de login no sistema.
 * @author João Pedro
 */
public class EntrarButton extends JButton{
    
    /**
     * Contrutor do botão de login do sistema. 
     * @param actionListener ActionListener atribuido ao botão.
     */
    public EntrarButton(ActionListener actionlistener){
        this.setText("Entrar");
        this.addActionListener(actionlistener);
    }
}
