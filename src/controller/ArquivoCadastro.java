package controller;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import model.Produto;

/**
 * Classe responsável por gravar e ler a lista de produtos em um arquivo.
 * @author João Pedro
 */
public class ArquivoCadastro {
	
	/**
     * Método vazio responsável por escrever e ler a lista de produtos em um arquivo.
     */
	public static void salvar() {

		// Escrevendo Lista de Produtos
		try{
			FileOutputStream arquivoSaida = new FileOutputStream("src\\saida.dat");
			ObjectOutputStream saida = new ObjectOutputStream(arquivoSaida);
			saida.writeObject(Produto.listaProdutos);
			saida.close();
		}catch (IOException exeption) {
			exeption.printStackTrace();
		}

		// Lendo Lista de Produtos
		try{
			FileInputStream arquivoLeitura= new FileInputStream("src\\saida.dat");
			ObjectInputStream leitura = new ObjectInputStream(arquivoLeitura);
			
			ArrayList<Produto> listaLida = (ArrayList<Produto>) leitura.readObject();
			System.out.println(listaLida);
			
			leitura.close();
	
		}
		catch(EOFException exception) {
			System.out.println("Fim do arquivo alcançado.");
		}
		catch (IOException | ClassNotFoundException exception) {
			exception.printStackTrace();
		}
	}
}

	
	

