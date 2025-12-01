package view.frames;

import java.awt.Dimension;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


import controller.EntrarButtonController;
import controller.LimparLoginController;
import controller.MouseListenerController;
import view.buttons.EntrarButton;
import view.buttons.LimparButton;

/**
 * Classe responsável pelo JFrame de Login.
 * @author João Pedro
 */
public class LoginGUI extends JFrame {

    private final Dimension dimension = new Dimension(500,500);
    private JLabel lblUser;
    private JLabel lblSenha;
    private JTextField txtUser;
    private JTextField txtSenha;
    private ArrayList<JTextField> txtFields; 
    private EntrarButton entrarButton;
    private LimparButton limparButton;
    private ImageIcon image;

    /**
     * Construtor vazio do JFrame de Login.
     */
    public LoginGUI(){

        // Definindo propriedades básicas do JFrame de Login
        setTitle("Login de Usuário");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(dimension);
        setLayout(null);
        setResizable(false);
        setLocationRelativeTo(null);

        image = new ImageIcon("src\\mercado.png");
        setIconImage(image.getImage());

        // Inicializando Arraylist de JtextFields
        this.txtFields = new ArrayList<JTextField>();


        // Adicionando Label "User"
        lblUser = new JLabel("User");
        lblUser.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblUser.setBounds(100, 40, 100, 30);
        this.add(lblUser);

        // Adicionando Label "Senha"
        lblSenha = new JLabel("Senha");
        lblSenha.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblSenha.setBounds(100, 120, 100, 30);
        this.add(lblSenha);

        // Adicionado TextField do User
        txtUser = new JTextField();
        //txtUser.setPreferredSize(new Dimension(300,70));
        txtUser.setBounds(100, 70, 300, 40);
        txtFields.add(txtUser);
        this.add(txtUser);

        // Adicionado TextField da Senha
        txtSenha = new JTextField();
        //txtSenha.setPreferredSize(new Dimension(300,70));
        txtSenha.setBounds(100, 150, 300, 40);
        txtFields.add(txtSenha);
        this.add(txtSenha);

        // Adicionando Botão "Limpar"
        limparButton = new LimparButton(new LimparLoginController(this));
        limparButton.setBounds(100, 195, 300, 30);
        limparButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
        limparButton.setFocusable(false);
        limparButton.setForeground(Color.black);
        limparButton.setBorderPainted(false);
        limparButton.setContentAreaFilled(false);
        limparButton.addMouseListener(new MouseListenerController(limparButton));
        this.add(limparButton);

        // Adicionando Botão "Entrar"
        entrarButton = new EntrarButton(new EntrarButtonController(this));
        entrarButton.setBounds(95, 260, 310, 45);
        entrarButton.setFont(new Font("Tahoma", Font.BOLD, 15));
        entrarButton.setFocusable(false);
        entrarButton.setForeground(Color.white);
        entrarButton.setBackground(new Color(64,154,60));
        this.add(entrarButton);

        setVisible(true);
    }
    
    /**
     * Método para obter a String presente no JTextField txtUser.
     * @return String
     */
    public String getUser(){
        return txtUser.getText();
    }

    /**
     * Método para definir a String do JTextField txtUser.
     * @param str Usuário para login. 
     */
    public void setUser(String str){
        txtUser.setText(str);
    }

    /**
     * Método para obter a String presente no JTextField txtSenha.
     * @return String
     */
    public String getSenha(){
        return txtSenha.getText();
    }

    /**
     * Método para definir a String do JTextField txtSenha.
     * @param str Senha do usuário. 
     */
    public void setSenha(String str){
        txtSenha.setText(str);
    }
}
