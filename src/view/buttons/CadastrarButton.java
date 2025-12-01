package view.buttons;

import java.awt.event.ActionListener;

import javax.swing.JButton;

/**
 * Classe responsável por representar o botão de cadastro.
 * @author João Pedro
 */
public class CadastrarButton extends JButton{

    /**
     * Construtor do botão de cadastro.
     * @param actionListener ActionListener atribuido ao botão.
     */
    public CadastrarButton(ActionListener actionlistener){
        this.setText("Cadastrar");
        this.addActionListener(actionlistener);
    }
}
