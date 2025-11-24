package view.frames;

import java.awt.Dimension;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import controller.EntrarButtonController;
import controller.LimparButtonController;
import view.buttons.EntrarButton;
import view.buttons.LimparButton;

public class FrameLogin extends JFrame {

    private final Dimension dimension = new Dimension(500,500);
    private JLabel lblUser;
    private JLabel lblSenha;
    private JTextField txtUser;
    private JTextField txtSenha;
    private ArrayList<JTextField> txtFields = new ArrayList<JTextField>();
    private EntrarButton entrarButton;
    private LimparButton limparButton;

    public FrameLogin(){
        setTitle("Login de Usuário");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(dimension);
        setLayout(null);
        setResizable(false);
        setLocationRelativeTo(null);
        addlblUser(this);
        addlblSenha(this);
        addtxtUser(this);
        addtxtSenha(this);
        addLimparButton(this);
        addEntrarButton(this);
        setVisible(true);
    }

    private void addlblUser(JFrame jframe){
        lblUser = new JLabel("User");
        lblUser.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblUser.setBounds(100, 40, 100, 30);
        jframe.add(lblUser);

    }
    private void addlblSenha(JFrame jframe){
        lblSenha = new JLabel("Senha");
        lblSenha.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblSenha.setBounds(100, 120, 100, 30);
        jframe.add(lblSenha);
    }

    private void addtxtUser(JFrame jframe){
        txtUser = new JTextField();
        txtUser.setPreferredSize(new Dimension(300,70));
        txtUser.setBounds(100, 70, 300, 40);
        txtFields.add(txtUser);
        jframe.add(txtUser);
    }

    private void addtxtSenha(JFrame jframe){
        txtSenha = new JTextField();
        txtSenha.setPreferredSize(new Dimension(300,70));
        txtSenha.setBounds(100, 150, 300, 40);
        txtFields.add(txtSenha);
        jframe.add(txtSenha);
    }

    private void addEntrarButton(JFrame jframe){
        entrarButton = new EntrarButton(new EntrarButtonController(this));
        entrarButton.setBounds(95, 240, 310, 45);
        entrarButton.setFont(new Font("Tahoma", Font.BOLD, 15));
        entrarButton.setFocusable(false);
        entrarButton.setForeground(Color.white);
        entrarButton.setBackground(new Color(64,154,60));
        jframe.add(entrarButton);
    }

    private void addLimparButton(JFrame jframe){
        limparButton = new LimparButton(new LimparButtonController(txtFields));
        limparButton.setBounds(100, 190, 300, 30);
        limparButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
        limparButton.setFocusable(false);
        limparButton.setForeground(Color.black);
        limparButton.setBorderPainted(false);
        limparButton.setContentAreaFilled(false);
        jframe.add(limparButton);
    }
}
