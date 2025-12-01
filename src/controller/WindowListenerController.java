package controller;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import view.frames.ProdutoGUI;

/**
 * Classe que implementa a clsse WindownListener responsável pelo fechamento da tela de cadastro de produtos.
 * @author João Pedro
 */
public class WindowListenerController implements WindowListener{
    private ProdutoGUI produtoGUI;

    /**
     * Construtor do WindowListenerController.
     * @param produtoGUI Tela de Cadastro
     */
    public WindowListenerController(ProdutoGUI produtoGUI){
        this.produtoGUI = produtoGUI;
    }

    /**
     * Método implementado da interface WindowListener que define seu comportameno ao fechamento.
     * @param e WindowEvent
     */
    @Override
    public void windowClosing(WindowEvent e) {
        
        String[] opcoes = {"Sim","Não"};
        int result = JOptionPane.showOptionDialog(produtoGUI, "Deseja mesmo sair?", "Confirmar saída", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);

        if (result == JOptionPane.YES_OPTION) {

            // Escrevendo Lista de Produtos e Fechando ProdutoGUI
            ArquivoCadastro.salvar();
            produtoGUI.dispose();
        }
        if (result == JOptionPane.NO_OPTION){
            produtoGUI.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        }
    }

    /**
     * Método não implementado.
     * @param e WindowEvent.
     */
    @Override
    public void windowClosed(WindowEvent e) {}

    /**
     * Método não implementado.
     * @param e WindowEvent.
     */
    @Override
    public void windowIconified(WindowEvent e) {}

    /**
     * Método não implementado.
     * @param e WindowEvent.
     */
    @Override
    public void windowDeiconified(WindowEvent e) {}

    /**
     * Método não implementado.
     * @param e WindowEvent.
     */
    @Override
    public void windowActivated(WindowEvent e) {}

    /**
     * Método não implementado.
     * @param e WindowEvent.
     */
    @Override
    public void windowDeactivated(WindowEvent e) {}

    /**
     * Método não implementado.
     * @param e WindowEvent.
     */
    @Override
    public void windowOpened(WindowEvent e) {}
}
