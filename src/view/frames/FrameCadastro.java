package view.frames;

import java.awt.Color;
import java.awt.ContainerOrderFocusTraversalPolicy;
import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import controller.CadastrarButtonController;
import controller.EntrarButtonController;
import controller.LimparCadastroController;
import controller.LimparLoginController;
import controller.MouseListenerController;
import view.buttons.CadastrarButton;
import view.buttons.LimparButton;


public class FrameCadastro extends JFrame {
    private final Dimension dimension = new Dimension(500,600);
    private JTextField txtCodigo;
    private JTextField txtNome;
    private JTextField txtPreco;
    private JComboBox<String> cbbCategoria;
    private ImageIcon image;
    private ArrayList<JTextField> txtFields;
    private JTable tabelacadastro;
    private JScrollPane jScrollPane;
    
    private LimparButton limparButton;
    private CadastrarButton cadastrarButton;

    public FrameCadastro() {
        // Definindo propriedades básicas do JFrame de Login
        setTitle("Cadastro de Produto");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(dimension);
        setLayout(null);
        setResizable(false);
        setLocationRelativeTo(null);

        image = new ImageIcon("src\\mercado.png");
        setIconImage(image.getImage());


        // Adicionando Label "Código"
        JLabel lblCodigo = new JLabel("Código:");
        lblCodigo.setFont(new Font("Tahoma", Font.BOLD, 14));
        //lblCodigo.setBackground(Color.BLUE);lblCodigo.setOpaque(true);
        //lblCodigo.setHorizontalAlignment(JLabel.CENTER);lblCodigo.setVerticalAlignment(JLabel.CENTER);
        lblCodigo.setBounds(100, 20, 100, 30);
        add(lblCodigo);

        // Adicionando TextField do Código
        txtCodigo = new JTextField();
        txtCodigo.setBounds(100, 50, 300, 30);
        add(txtCodigo);
     
        
        // Adicionando Label "Nome"
        JLabel lblNome = new JLabel("Nome:");
        lblNome.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblNome.setBounds(100, 85, 100, 30);
        add(lblNome);

        // Adicionando TextField do Nome
        txtNome = new JTextField();
        txtNome.setBounds(100, 115, 300, 30);
        add(txtNome);

       // Adicionando Label "Preço Unitário"
        JLabel lblPreco = new JLabel("Preço Unitário:");
        lblPreco.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblPreco.setBounds(100, 150, 110, 30);
        //lblPreco.setBackground(Color.BLACK);
        //lblPreco.setOpaque(true);
        add(lblPreco);

        // Adicionando TextField do Preço
        txtPreco = new JTextField();
        txtPreco.setBounds(100, 180, 300, 30);
        add(txtPreco);

        // Adicionando Label "Categoria"
        JLabel lblCategoria = new JLabel("Categoria:");
        lblCategoria.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblCategoria.setBounds(100, 215, 100, 30);
        add(lblCategoria);

        // Adicionando ComboBoX Categoria
        cbbCategoria = new JComboBox<>(new String[]{
                "", "Alimentos", "Bebidas", "Limpeza", "Higiene", "Outros"
        });
        cbbCategoria.setBounds(100, 245, 300, 30);
        add(cbbCategoria);

        // Adicionando Botão "Limpar"
        limparButton = new LimparButton(new LimparCadastroController(this));
        limparButton.setBounds(100, 280, 300, 30);
        limparButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
        limparButton.setFocusable(false);
        limparButton.setForeground(Color.black);
        limparButton.setBorderPainted(false);
        limparButton.setContentAreaFilled(false);
        limparButton.addMouseListener(new MouseListenerController(limparButton));
        add(limparButton);

        // Adicionando Botão "Cadastrar"
        cadastrarButton = new CadastrarButton(new CadastrarButtonController(this));
        cadastrarButton.setBounds(95, 330, 310, 45);
        cadastrarButton.setFont(new Font("Tahoma", Font.BOLD, 15));
        cadastrarButton.setFocusable(false);
        cadastrarButton.setForeground(Color.white);
        cadastrarButton.setBackground(new Color(64,154,60));
        add(cadastrarButton);
        
        definirTabelaCadastro();
        jScrollPane = new JScrollPane(tabelacadastro);
        jScrollPane.setBounds(80, 390, 340, 150);
        jScrollPane.setVisible(true);
        add(jScrollPane);

        setVisible(true);
    }


    public String getCodigo() {
        return txtCodigo.getText();
    }

    public void setCodigo(String str) {
        txtCodigo.setText(str);
    }

    public String getNome() {
        return txtNome.getText();
    }

    public void setNome(String str) {
        txtNome.setText(str);
    }

    public String getCategoria() {
        return cbbCategoria.getSelectedItem().toString();
    }
    public void clearCategoria() {
        cbbCategoria.setSelectedIndex(0);
    }

    public String getPreco() {
        return txtPreco.getText();
    }

    public void setPreco(String str) {
        txtPreco.setText(str);
    }

    public void exibirMensagem(String msg) {
        JOptionPane.showMessageDialog(this, msg);
    }

    public void definirTabelaCadastro(){
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Código");
        modelo.addColumn("Nome");
        modelo.addColumn("Categoria");
        modelo.addColumn("Preço");

        tabelacadastro = new JTable(modelo);
    }
}