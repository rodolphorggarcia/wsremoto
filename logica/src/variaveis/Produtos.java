package variaveis;

import javax.swing.JOptionPane;

public class Produtos {

	public static void main(String[] args) {
	
		String produto = JOptionPane.showInputDialog("Produto");
		System.out.println(produto);
		/*
		 * Entre os tipos primitivos inteiros
		 * byte=> -128 / +127
		 * short=> -32... / +32....
		 * int=> -2b... / +2b...
		 * long=> -9..../ +9 ...
		 * */
		
		short qtde = Short.parseShort(JOptionPane.showInputDialog("Qtde:"));
		System.out.println(qtde);
				
		/*
		 * Entre tipos primitivos reais
		 * floar => pouca precisao nas casas decimais
		 * double=> dobro de precisao do float1
		 * */

				
		float valor = Float.parseFloat(JOptionPane.showInputDialog("Valor: "));
		//Cast e um converao entre dados do mesmo tipo, MAs com tamanhos diferentes
		System.out.println(valor);
		
		int numero = 10;
		qtde = (short) numero;
		System.out.println(qtde);	
		
		
	}

}
