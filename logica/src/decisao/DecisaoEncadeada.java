package decisao;

import javax.swing.JOptionPane;

public class DecisaoEncadeada {

	public static void main(String[] args) {


		String nome = JOptionPane.showInputDialog("Nome").toUpperCase();
		short faltas = Short.parseShort(JOptionPane.showInputDialog("Faltas:"));
		if(faltas <20) {
			float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Nota1"));
			float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Nota2"));
			float media = (nota1+nota2)/2;
			if(media >= 6 ) {
				System.out.println(nome + " Parabens voce foi aprovado");
			}
			else if(media < 6 && media >=4) {
				System.out.println(nome+ " voce tem outra chance, estude para recupera�ao!!");
			}
			else {
				System.out.println(nome + " Voce foi reprovado, estude mais!!");
			}
		}
		else {
			System.out.println(nome + " Voce foi reprovado pela quantidade de faltas");	
		}
	}
}
