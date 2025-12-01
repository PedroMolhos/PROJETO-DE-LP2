package controller;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

/**
 * Classe responsável por implementar uma interface MouseListener.
 * @author João Pedro
 */
public class MouseListenerController implements MouseListener{
    private JButton jButton;

    /**
     * Construtor do MouseListenerController.
     * @param jButton Botão de escolha.
     */
    public MouseListenerController(JButton jButton){
        this.jButton = jButton;
    }

    /**
     * Método não implementado.
     * @param e MouseEvent.
     */
    @Override
    public void mouseClicked(MouseEvent e) {

    }

    /**
     * Método não implementado.
     * @param e MouseEvent.
     */
    @Override
    public void mousePressed(MouseEvent e) {

    }

    /**
     * Método não implementado.
     * @param e MouseEvent.
     */
    @Override
    public void mouseReleased(MouseEvent e) {

    }

    /**
     * Método responsável por alterar a fonte do botão ao entrar em seu espaço.
     * @param e MouseEvent.
     */
    @Override
    public void mouseEntered(MouseEvent e) {
        jButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
        jButton.setForeground(Color.blue);
    }

    /**
     * Método responsável por alterar a fonte do botão ao sair do seu espaço.
     * @param e MouseEvent.
     */
    @Override
    public void mouseExited(MouseEvent e) {
        jButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
        jButton.setForeground(Color.black);
    }

}
