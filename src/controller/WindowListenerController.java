package controller;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import view.frames.ProdutoGUI;


public class WindowListenerController implements WindowListener{
    private ProdutoGUI produtoGUI;

    public WindowListenerController(ProdutoGUI produtoGUI){
        this.produtoGUI = produtoGUI;
    }

    @Override
    public void windowClosing(WindowEvent e) {
        
        String[] opcoes = {"Sim","Não"};
        int result = JOptionPane.showOptionDialog(produtoGUI, "Deseja mesmo sair?", "Confirmar saída", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);

        if (result == JOptionPane.YES_OPTION) {

            // Escrevendo Lista de Produtos e Fechando ProdutoGUI
            ManusearArquivo.salvar();
            produtoGUI.dispose();
        }
        if (result == JOptionPane.NO_OPTION){
            produtoGUI.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        }
    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {
;
    }

    @Override
    public void windowOpened(WindowEvent e) {
    	

   
          
        }
}
