package decisao;

import javax.swing.JOptionPane;

public class DesafioDecisaoComposta {

	public static void main(String[] args) {
		String nomeProduto = JOptionPane.showInputDialog("Produto").toUpperCase();
		int qtde = Integer.parseInt(JOptionPane.showInputDialog("Quantidade"));
		float valor = Float.parseFloat(JOptionPane.showInputDialog("Valor"));
		
		if(qtde >=10 && qtde <=20) {
			System.out.println(nomeProduto + " Estoque normal!!");
			
		}
		else if(qtde <10) {
			System.out.println(nomeProduto + " Estoque baixo!!");
		
		}
		else {
			System.out.println(nomeProduto + " Estoque alto!!");
		}
		
	   if(valor > 1000) {
		   
		   System.out.println(nomeProduto + " Valor alto!!");
		   
	   }
	}

}
