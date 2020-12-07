package decisao;

import javax.swing.JOptionPane;

public class DecisaoComposta {

	public static void main(String[] args) {
		
		
		String nome = JOptionPane.showInputDialog("Nome").toUpperCase();
		float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Nota1"));
		float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Nota2"));
		float media = (nota1+nota2)/2;
		
		if(media >= 6 ) {
			System.out.println(nome + " Parabens voce foi aprovado");
			
		}
		else if(media < 6 && media >=4) {
			System.out.println(nome+ " voce tem outra chance, estude para recuperaçao!!");
			
		}
		else {
			System.out.println(nome + " Voce foi reprovado, estude mais!!");
			
		}
		
		System.out.println("Sua média foi: "+ media);
		
		

	}

}
