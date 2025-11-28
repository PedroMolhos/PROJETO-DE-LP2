package controller;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

public class MouseListenerController implements MouseListener{
    private JButton jButton;
    public MouseListenerController(JButton jButton){
        this.jButton = jButton;
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        jButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
        jButton.setForeground(Color.blue);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        jButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
        jButton.setForeground(Color.black);
    }

}
