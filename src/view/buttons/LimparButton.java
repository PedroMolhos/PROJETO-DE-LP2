package view.buttons;

import java.awt.event.ActionListener;

import javax.swing.JButton;

/**
 * Classe responsável pelo botão de limpar os campos em tela.
 * @author João Pedro
 */
public class LimparButton extends JButton{

    /**
     * Construtor do botão de limpar os campos em tela.
     * @param actionListener ActionListener atribuido ao botão.
     */
    public LimparButton(ActionListener actionListener){
        this.setText("Limpar Dados");
        this.addActionListener(actionListener);
    }
}
