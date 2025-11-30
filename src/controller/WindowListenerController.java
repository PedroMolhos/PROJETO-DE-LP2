package controller;


import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import model.Produto;
import view.frames.ProdutoGUI;

public class WindowListenerController implements WindowListener{
    private ProdutoGUI produtoGUI;

    public WindowListenerController(ProdutoGUI produtoGUI){
        this.produtoGUI = produtoGUI;
    }

    @Override
    public void windowClosing(WindowEvent e) {
        int result = JOptionPane.showConfirmDialog(
                        produtoGUI,
                        "Deseja mesmo sair?",
                        "Confirmar saída",
                        JOptionPane.YES_NO_OPTION);

        if (result == JOptionPane.YES_OPTION) {
            Vector<Vector> dados = produtoGUI.getModel().getDataVector();

            try{
                FileOutputStream file = new FileOutputStream("src\\saida.dat");
                ObjectOutputStream saida = new ObjectOutputStream(file);
                saida.writeObject(dados);

                saida.close();
            } catch (IOException exeption) {
                exeption.printStackTrace();
            }
            produtoGUI.dispose();
            try{
                FileInputStream entrada = new FileInputStream("src\\saida.dat");
                ObjectInputStream leitura = new ObjectInputStream(entrada);
                Vector<Vector> output = (Vector<Vector>) leitura.readObject();
                System.out.println(output);
                leitura.close();
                entrada.close();
            }
            catch(EOFException exception) {
                System.out.println("Fim do arquivo alcançado.");
            }
            catch (IOException | ClassNotFoundException exception) {
                exception.printStackTrace();
            }
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
