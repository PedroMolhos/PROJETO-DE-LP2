package controller;

import javax.swing.JOptionPane;
import model.Produto;

/**
 * Classe responsável por validar os dados de cadastro de produto.
 * @author João Pedro
 */
public class ValidarCadastro {

	public static long codigo;
    public static String nome;
    public static String categoria;
    public static double preco;
    
	
    /**
     * Método que valida um produto a ser cadastrado. Retorna falso se algo nao foi inserido 
	 * ou se foi inserido incorretamente, e true se esta tudo correto. 
     * @param Ccodigo codigo que identifica o produto.
     * @param Cnome nome do produto.
     * @param Ccategoria categoria do produto.
     * @param Cpreco preço do produto.
     */
    public static boolean validar (String Ccodigo, String Cnome, String Ccategoria, String Cpreco) {

    	//Verifica se as strings estão vazias 
    	if(!(Ccodigo.isBlank()) && !(Cnome.isBlank()) &&
    		!(Ccategoria.isBlank()) && !(Cpreco.isBlank())){

    		//Verifica se a string do codigo inserido consegue ser convertida para long
    		try { 	
				codigo = Long.parseLong(Ccodigo);

    	    } catch (NumberFormatException erro) {
				JOptionPane.showMessageDialog(null,"Código inválido!\nDigite apenas números.", "Cadastro não realizado",0);
				return false;}

    	    //Verifica se a string do preço inserido consegue ser convertida para double
    	    try {
				preco = Double.parseDouble(Cpreco);
			} catch (NumberFormatException erro) {
				JOptionPane.showMessageDialog(null,"Preço inválido!\nDigite apenas números.\nUse . (ponto) ao inves de , (vírgula) ", "Cadastro não realizado",0);
				return false;
			}
    	           
			categoria = Ccategoria;       
			nome = Cnome;
			
			// Adiciona o novo Produto na Arraylist da Classe Produto
			Produto novoProduto = new Produto(codigo,nome,categoria,preco);
			Produto.listaProdutos.add(novoProduto);


    	    return true;
    		
    	}
		else{
			// Mensagem de Campos em Branco
			JOptionPane.showMessageDialog(null,
				"Campos obrigatórios não prenchidos", 
				"Cadastro não Realizado",
				0);
			return false;
		}
      

    }
      
}
