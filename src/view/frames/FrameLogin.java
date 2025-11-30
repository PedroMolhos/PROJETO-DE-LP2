package view.frames;

import java.awt.Dimension;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import controller.EntrarButtonController;
import controller.LimparLoginController;
import controller.MouseListenerController;
import view.buttons.EntrarButton;
import view.buttons.LimparButton;

public class FrameLogin extends JFrame {

    private final Dimension dimension = new Dimension(500,500);
    private JLabel lblUser;
    private JLabel lblSenha;
    private JTextField txtUser;
    private JTextField txtSenha;
    private ArrayList<JTextField> txtFields; 
    private EntrarButton entrarButton;
    private LimparButton limparButton;
    private ImageIcon image;


    /*                                     TESTE:
    private JTable tabela;
    private JScrollPane jScrollPane;
    private DefaultTableModel modelo;
    */

    // Construtor da Tela de Login
    public FrameLogin(){

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

        /**                                      TESTE:

        modelo = new DefaultTableModel();
        modelo.addColumn("Código");
        modelo.addColumn("Nome");
        modelo.addColumn("Categoria");
        modelo.addColumn("Preço");
        String[] colunas = {"Código", "Nome", "Categoria","Preço"};
        Object[][] data = {
            {"1","a","a","a"},
            {"1","a","a","a"},
            {"1","a","a","a"},
            {"1","a","a","a"},
            {"1","a","a","a"},
        };  
        
        tabela = new JTable(data,colunas);
        jScrollPane = new JScrollPane(tabela);
        jScrollPane.setBounds(50,320,400,100);
        jScrollPane.setVisible(true);
        this.add(jScrollPane);
        */

        setVisible(true);
    }

public String getUser(){
    return txtUser.getText();
}

public void setUser(String str){
    txtUser.setText(str);
}

public String getSenha(){
    return txtSenha.getText();
}

public void setSenha(String str){
    txtSenha.setText(str);
}
}
